import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Unit[] arr = new Unit[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = new Unit(i, sc.nextInt());
		}
		Arrays.sort(arr);
		int count = 0;
		for (int i = 0; i < n; i++) {
		    if (i % 2 != arr[i].idx % 2) {
		        count++;
		    }
		}
		System.out.println(count / 2);
	}
	
	static class Unit implements Comparable<Unit> {
	    int idx;
	    int value;
	    
	    public Unit (int idx, int value) {
	        this.idx = idx;
	        this.value = value;
	    }
	    
	    public int compareTo(Unit another) {
	        return value - another.value;
	    }
	}
}
