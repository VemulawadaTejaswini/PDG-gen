import java.util.*;

public class Main {
 	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Work[] arr = new Work[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = new Work(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(arr);
		int total = 0;
		for (int i = 0; i < n; i++) {
		    total += arr[i].time;
		    if (total > arr[i].limit) {
		        System.out.println("No");
		        return;
		    }
		}
		System.out.println("Yes");
   }
   
   static class Work implements Comparable<Work> {
       int time;
       int limit;
       
       public Work (int time, int limit) {
           this.time = time;
           this.limit = limit;
       }
       
       public int compareTo(Work another) {
           return limit - another.limit;
       }
   }
}


