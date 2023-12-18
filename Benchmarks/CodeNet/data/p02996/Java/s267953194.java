import java.util.*;

public class Main {
 	public static void main (String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Work[] arr = new Work[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = new Work(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(arr);
		int now = 0;
		for (int i = 0; i < n; i++) {
		    now += arr[i].time;
		    if (now > arr[i].deadLine) {
		        System.out.println("No");
		        return;
		    }
		}
		System.out.println("Yes");
	}
	
	static class Work implements Comparable<Work> {
	    int time;
	    int deadLine;
	    public Work(int time, int deadLine) {
	        this.time = time;
	        this.deadLine = deadLine;
	    }
	    
	    public int compareTo(Work w) {
	        return deadLine - w.deadLine;
	    }
	}
}
