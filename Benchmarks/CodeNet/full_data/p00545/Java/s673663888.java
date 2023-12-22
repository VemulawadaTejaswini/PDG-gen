import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long t = sc.nextLong();
		int q = sc.nextInt();
		TreeSet<Long> place = new TreeSet<>();
		place.add(Long.MIN_VALUE);
		place.add(Long.MAX_VALUE);
		Person[] persons = new Person[n];
		long[] ans = new long[n];
		persons[0] = new Person(sc.nextLong(), sc.nextInt() == 1);
		for (int i = 1; i < n; i++) {
		    persons[i] = new Person(sc.nextLong(), sc.nextInt() == 1);
		    if (persons[i - 1] != null && persons[i - 1].isEast && !persons[i].isEast && persons[i].point - persons[i - 1].point <= 2 * t) {
		        long x = (persons[i].point + persons[i - 1].point) / 2;
		        ans[i - 1] = x;
		        ans[i] = x;
		        persons[i] = null;
		        persons[i - 1] = null;
		        place.add(x);
		    }
		}
		for (int i = 0; i < n; i++) {
		    Person p = persons[i];
		    if (p == null) {
		        continue;
		    }
		    long x;
		    if (p.isEast) {
		        x = Math.min(place.higher(p.point), p.point + t);
		    } else {
		        x = Math.max(place.lower(p.point), p.point - t);
		    }
		    ans[i] = x;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    int x = sc.nextInt() - 1;
		    sb.append(ans[x]).append("\n");
		}
		System.out.print(sb);
	}
	
	static class Person {
	    long point;
	    boolean isEast;
	    
	    public Person (long point, boolean isEast) {
	        this.point = point;
	        this.isEast = isEast;
	    }
	}
}

