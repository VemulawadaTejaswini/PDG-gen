import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int a = sc.nextInt();
		Monster[] monsters = new Monster[n];
		for (int i = 0; i < n; i++) {
		    monsters[i] = new Monster(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(monsters);
		int damage = 0;
		long total = 0;
		ArrayDeque<Time> deq = new ArrayDeque<>();
		for (int i = 0; i < n; i++) {
		    while (deq.size() > 0 && deq.peek().point < monsters[i].point) {
		        damage -= deq.poll().times * a;
		    }
		    monsters[i].helth -= damage;
		    if (monsters[i].helth > 0) {
		        int count = (monsters[i].helth + a - 1) / a;
		        deq.add(new Time(count, monsters[i].point + 2 * d));
		        damage += count * a;
		        total += count;
		    }
		}
		System.out.println(total);
	}
	
	
	static class Time {
	    int times;
	    int point;
	    
	    public Time(int times, int point) {
	        this.times = times;
	        this.point = point;
	    }
	}
	static class Monster implements Comparable<Monster> {
	    int point;
	    int helth;
	    
	    public Monster(int point, int helth) {
	        this.point = point;
	        this.helth = helth;
	    }
	    
	    public int compareTo(Monster another) {
	        return point - another.point;
	    }
	}
}
