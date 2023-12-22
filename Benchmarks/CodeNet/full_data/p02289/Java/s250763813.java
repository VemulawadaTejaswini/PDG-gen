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
		CommandInfo cmd = null;
		while(!(cmd=readCommand()).end){
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
	
	private CommandInfo readCommand() throws IOException {
		return CommandInfo.parse(in.br.readLine());
		
	}
}

class CommandInfo {
	public static CommandInfo parse(String cmd){
		CommandInfo c = new CommandInfo();
		if(cmd.charAt(2)=='d'){
			c.cmd="end";
			c.cmdChar='d';
			c.end=true;
		}else if(cmd.charAt(0)=='e'){
			c.cmd="extract";
			c.cmdChar='e';
		}else{
			c.cmd="insert";
			c.cmdChar='i';
			c.argument=Integer.parseInt(cmd.substring(7));
		}
		return c;
	}

	String cmd = null;
	char cmdChar = 0;
	int argument = -1;
	boolean end = false;
	
	private CommandInfo(){}
}

class BinaryHeap {
	protected int[] data = null;
	protected int dataPtr = -1;

	public BinaryHeap(int maxNodes) {
		data = new int[maxNodes+1];
		dataPtr = 1;
	}
	
	public int[] getAll() {
		return data;
	}
	
	public int get(int i) {
		if(i<=0 || data.length<=i) throw new IllegalArgumentException();
		return data[i];
	}
	
	public void set(int i, int value) {
		if(i<=0 || data.length<=i) throw new IllegalArgumentException();
		data[i] = value;
	}

	public int getRoot() {
		return get(1);
	}


	public void setRoot(int value) {
		set(1,value);
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
		if(i<=1 || data.length<=i) return -1;
		return i/2;
	}

	public int getLeft(int i){
		int leftId = i*2;
		return (i<=0 || data.length<=leftId) ? -1 : leftId;
	}

	public int getRight(int i){
		int rightId = i*2 + 1;
		return (i<=0 || data.length<=rightId) ? -1 :rightId;
	}
}

class MaximumHeap extends BinaryHeap {
	
	public MaximumHeap(int maxNodes) {
		super(maxNodes);
	}
	
	protected void maxHeapify(int i) {
		int leftId = getLeft(i);
		int rightId = getRight(i);
		int largest = i;
		if(leftId != -1 && data[largest] < data[leftId]) largest = leftId;
		if(rightId != -1 && data[largest] < data[rightId]) largest = rightId;
		if(largest != i){
			data[0] = data[i]; data[i] = data[largest]; data[largest] = data[0];
			maxHeapify(largest);
		}
	}
	
}

class PriorityQueue extends MaximumHeap {
	
	public PriorityQueue(int maxNodes) {
		super(maxNodes);
	}
	
	public void insert(int value) {
		for(int id = getParent(addLast(value)); id != -1; id = getParent(id)){
			maxHeapify(id);
		}
	}
	
	public int extract() {
		int ret = getRoot();
		setRoot(removeLast());
		maxHeapify(1);
		return ret;
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