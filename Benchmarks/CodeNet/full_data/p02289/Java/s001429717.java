import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		new Main().exec();
	}

	public void exec() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		PriorityQueue pq = new PriorityQueue(2000000);
		String str = null;
		while(true){
			str=br.readLine();
			if(str.charAt(0)=='i'){
				pq.insert(Integer.parseInt(str.substring(7)));
			}else if(str.charAt(1)=='x'){
				out.println(pq.extract());
			}else{
				break;
			}
		}
		out.flush();
	}
}


class PriorityQueue  {
	protected int[] data = null;
	protected int dataPtr = -1;

	public PriorityQueue(int maxNodes) {
		data = new int[maxNodes+1];
		dataPtr = 1;
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
		int id = dataPtr++;
		data[id] = value;
		for(int pid = getParent(id); pid != -1 && value>data[pid]; pid=getParent(id=pid)){
			data[id] = data[pid];
		}
		data[id]=value;
	}

	public int extract() {
		if(dataPtr <= 1)
			throw new IllegalStateException();
		int ret = data[1];
		data[1] = data[--dataPtr];
		if(dataPtr > 1){
			maxHeapify(1);
		}
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