import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	
	InputUtil in = new InputUtil();

	public static void main(String[] args) throws IOException {
		new Main().exec();
	}

	public void exec() throws IOException {
		PrintWriter out = new PrintWriter(System.out);
		PriorityQueue pq = new PriorityQueue(2000000);
		CommandInfo cmd = new CommandInfo();
		while(!cmd.parse(in.br.readLine()).end){
			switch(cmd.cmdChar){
			case 'i':
				pq.insert(cmd.argument);
				break;
			case 'e':
				out.println(pq.extract());
				break;
			default:
			}
		}
		out.flush();
	}
}

class CommandInfo {

	String cmd = null;
	char cmdChar = 0;
	int argument = -1;
	boolean end = false;
	
	public CommandInfo(){}

	public CommandInfo parse(String cmdStr){
		if(cmdStr.charAt(2)=='d'){
			cmd="end";
			cmdChar='d';
			end=true;
		}else if(cmdStr.charAt(0)=='e'){
			cmd="extract";
			cmdChar='e';
		}else{
			cmd="insert";
			cmdChar='i';
			argument=Integer.parseInt(cmdStr.substring(7));
		}
		return this;
	}
}


class PriorityQueue  {
	protected int[] data = null;
	protected int dataPtr = -1;

	public PriorityQueue(int maxNodes) {
		data = new int[maxNodes+1];
		dataPtr = 1;
	}

	public int[] getAll() {
		return data;
	}

	public int removeLast() {
		if(dataPtr <= 1) return -1;
		return data[--dataPtr];
	}
	
	public int addLast(int value) {
		if(dataPtr >= data.length) return -1;
		int ret = dataPtr++;
		data[ret] = value;
		return ret;
	}

	public int getParent(int i){
		if(i<=1 || dataPtr<=i) return -1;
		return i/2;
	}

	public int getLeft(int i){
		int leftId = i*2;
		return (i<=0 || dataPtr<=leftId) ? -1 : leftId;
	}

	public int getRight(int i){
		int rightId = i*2 + 1;
		return (i<=0 || dataPtr<=rightId) ? -1 :rightId;
	}
	
	public void insert(int value) {
		int id = addLast(value);
		for(int pid = getParent(id); pid != -1 && value>data[pid]; pid=getParent(id=pid)){
			data[id] = data[pid];
		}
		data[id]=value;
	}
	
	public int extract() {
		int ret = data[1];
		data[1] = removeLast();
		maxHeapify(1);
		return ret;
	}
	
	protected void maxHeapify(int i) {
		int largest = i,leftId,rightId;
		while(true){
			leftId = getLeft(i);
			rightId = getRight(i);
			if(leftId != -1 && data[largest] < data[leftId]) largest = leftId;
			if(rightId != -1 && data[largest] < data[rightId]) largest = rightId;
			if(largest != i){
				data[0] = data[i]; data[i] = data[largest]; data[largest] = data[0];
				i = largest;
			}else{
				break;
			}
		}
	}
}

class InputUtil {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String[] readStrArray(String delim) throws NumberFormatException, IOException{
    	return br.readLine().split(delim);
    }
    
    public int nextInt() throws NumberFormatException, IOException{
    	return Integer.parseInt(br.readLine());
    }
    
    public int[] nextInt(int[] a, int off, int num) throws NumberFormatException, IOException{
        int i=off;
        while(i<off+num) {
            for(String s: br.readLine().split(" ")){
            	if(i<off+num) {
                    a[i++] = Integer.parseInt(s);
            	}
            }
        }
        return a;
    }
}