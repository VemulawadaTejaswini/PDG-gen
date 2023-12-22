import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
  
public class Main {
	private static final String EOF = System.lineSeparator();
	private MyIntQueue queue = new MyIntQueue();
	private ProcessManager pm = new ProcessManager();
    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
    
    public void exec() throws IOException {
    	SimpleInputUtil in = new SimpleInputUtil();
        PrintWriter out = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
    	
        int[] tmp = in.readIntArray(new int[2]);
    	int n = tmp[0];
    	int q = tmp[1];
    	
    	for(int i=0; i<n; i++) {
    		queue.add(pm.addProcess(in.readStrArray(" ")));
    	}
    	
    	int totalTime = 0;
    	while(!queue.isEmpty()) {
    		int procId = queue.remove();
    		int time = pm.getTime(procId);
    		if(time <= q) {
    			//Process Finish
    			totalTime += time;
    			sb.append(pm.getName(procId)).append(" ").append(totalTime).append(EOF);
    		}else{
    			//Process Continue
    			queue.add(procId);
    			pm.setTime(procId, time - q);
    			totalTime += q;
    		}
    	}
        out.print(sb.toString());
    	out.flush();
    }
}

class ProcessManager {
	private static final int CAPACITY = 100000;
	private String[] names = new String[CAPACITY];
	private int[] times = new int[CAPACITY];
	private int ptr = 0;
	
	public int addProcess(String[] procInfo) {
		names[ptr] = procInfo[0];
		times[ptr] = Integer.parseInt(procInfo[1]);
		return ptr++;
	}
	
	public String getName(int procId) {
		return names[procId];
	}
	
	public int getTime(int procId) {
		return times[procId];
	}
	
	public void setTime(int procId, int time) {
		times[procId] = time;
	}
}

class MyIntQueue {
	private static final int CAPACITY = 100000;
	private int[] queue = new int[CAPACITY];
    private int head = 0;
    private int tail = 0;
    
    public boolean isEmpty(){return head == tail;}
    public boolean isFull(){return (head+1)%CAPACITY == tail;}
    
    public int remove() {
    	if(isEmpty()) throw new IllegalStateException();
    	int ret = queue[tail++];
    	tail %= CAPACITY;
    	return ret;
    }
   
    public int add(int value) {
    	if(isFull()) throw new IllegalStateException();
    	int ret =  queue[head++] = value;
    	head %= CAPACITY;
    	return ret;
    }
}

class SimpleInputUtil {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String[] readStrArray(String delim) throws NumberFormatException, IOException{
    	return br.readLine().split(delim);
    }
    
    public int readInt() throws NumberFormatException, IOException{
    	return Integer.parseInt(br.readLine());
    }
    
    public int[] readIntArray(int[] a) throws NumberFormatException, IOException{
        int i=0;
        while(i<a.length) {
            for(String s: br.readLine().split(" ")){
            	if(i<a.length) {
                    a[i++] = Integer.parseInt(s);
            	}
            }
        }
        return a;
    }
}