import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Main{
    public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String line;

	line = br.readLine();
	int n = Integer.parseInt(line.substring(0,line.indexOf(' ')));
	int q = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
	Deque<Process> queue = new ArrayDeque<Process>();
	
	for(int i = 0;i < n;i++){
	    line = br.readLine();
	    String name = line.substring(0,line.indexOf(' '));
	    int time = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
	    queue.offer(new Process(name,time));
	}
	int elapse = 0;
	StringBuilder sb = new StringBuilder();
	while (!queue.isEmpty()) {
	    Process p = queue.poll();
	    if (p.getTime() <= q) {
		elapse += p.getTime();
		sb.append(p.getName() + " " + elapse + "\n");
	    } else {
		p.setTime(p.getTime() - q);
		elapse += q;
		queue.offer(p);
	    }
	}
	System.out.print(sb);
    }
}
class Process{
    private String name;
    private int time;
    public Process(String name,int time){
	this.name = name;
	this.time = time;
    }
    public void setName(String name){
	this.name = name;
    }
    public String getName(){
	return this.name;
    }
    public void setTime(int time){
	this.time = time;
    }
    public int getTime(){
	return this.time; 
    }
}
      

