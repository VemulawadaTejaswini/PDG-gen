import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Unit[] arr = new Unit[3 * n];
		TreeSet<Unit> befSet = new TreeSet<>();
		TreeSet<Unit> afSet = new TreeSet<>();
		TreeSet<Unit> stockSet = new TreeSet<>();
		long befScore = 0;
		long afScore = 0;
		for (int i = 0; i < n * 3; i++) {
		    arr[i] = new Unit(i, sc.nextInt());
		    if (i < n * 2) {
		        befSet.add(arr[i]);
		        befScore += arr[i].value;
		    } else {
		        afSet.add(arr[i]);
		        afScore += arr[i].value;
		    }
		}
		for (int i = 0; i < n; i++) {
		    Unit tmp = befSet.pollFirst();
		    befScore -= tmp.value;
		    stockSet.add(tmp);
		}
		long max = befScore - afScore;
		for (int i = 2 * n - 1; i >= n; i--) {
		    if (befSet.contains(arr[i])) {
		        befSet.remove(arr[i]);
		        befScore -= arr[i].value;
		        Unit tmp = stockSet.pollLast();
		        befSet.add(tmp);
		        befScore += tmp.value;
		    } else {
		        stockSet.remove(arr[i]);
		    }
		    afSet.add(arr[i]);
		    afScore += arr[i].value;
		    Unit tmp = afSet.pollLast();
		    afScore -= tmp.value;
		    max = Math.max(max, befScore - afScore);
		}
	    System.out.println(max);
   }
   
   static class Unit implements Comparable<Unit> {
       int id;
       int value;
       
       public Unit(int id, int value) {
           this.id = id;
           this.value = value;
       }
       
       public int hashCode() {
           return id;
       }
       
       public boolean equals(Object o) {
           Unit u = (Unit)o;
           return u.id == id && u.value == u.value;
       }
       
       public int compareTo(Unit another) {
           if (value == another.value) {
               return id - another.id;
           } else {
               return value - another.value;
           }
       }
       
       public String toString() {
           return id + ":" + value;
       }
   }
}


