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
		int H = in.nextInt();
		int[] heapData = in.nextInt(new int[H+1],1,H);
		MaximumHeap mh = new MaximumHeap(heapData);
		out.print(' ');
		OutputUtil.output(out, mh.getAll(), 1, H, " ");
		out.flush();
	}

	
}

class BinaryHeap {
	protected int[] data = null;
	
	public BinaryHeap(int[] data) {
		this.data = data;
	}
	
	public int[] getAll() {
		return data;
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
	
	public MaximumHeap(int[] data) {
		super(data);
		this.buildMaxHeap();
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
	
	public void buildMaxHeap() {
		for(int i=(data.length-1)/2; i>=1; i--)
			maxHeapify(i);
			
	}
	
}


class OutputUtil {
	public static final String EOF = System.lineSeparator();

	public static void output(PrintWriter out, int[] a, int off, int len, String delim) {
		out.print(a[off]);
		for(int i=off+1; i<off+len; i++){
			out.print(delim);
			out.print(a[i]);
		}
		out.println("");
		out.flush();
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