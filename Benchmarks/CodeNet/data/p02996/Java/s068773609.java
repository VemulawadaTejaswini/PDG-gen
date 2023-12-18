import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Work[] works = new Work[n];
		for (int i = 0; i < n; i++) {
		    works[i] = new Work(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(works);
		int current = 0;
		for (int i = 0; i < n; i++) {
		    current += works[i].time;
		    if (current > works[i].dead) {
		        System.out.println("No");
		        return;
		    }
		}
		System.out.println("Yes");
   }
    
    static class Work implements Comparable<Work> {
        int time;
        int dead;
        
        public Work(int time, int dead) {
            this.time = time;
            this.dead = dead;
        }
        
        public int compareTo(Work another) {
            return dead - another.dead;
        }
    }
}

