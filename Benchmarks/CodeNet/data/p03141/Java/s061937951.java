import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Dish[] arr = new Dish[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = new Dish(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(arr);
		long total = 0;
		for (int i = 0; i < n; i++) {
		    if (i % 2 == 0) {
		        total += arr[i].takahashi;
		    } else {
		        total -= arr[i].aoki;
		    }
		}
		System.out.println(total);
	}
	
	static class Dish implements Comparable<Dish> {
	    int takahashi;
	    int aoki;
	    public Dish(int takahashi, int aoki) {
	        this.takahashi = takahashi;
	        this.aoki = aoki;
	    }
	    
	    public int compareTo(Dish another) {
	        return another.takahashi + another.aoki - takahashi - aoki;
	    }
	}
}
