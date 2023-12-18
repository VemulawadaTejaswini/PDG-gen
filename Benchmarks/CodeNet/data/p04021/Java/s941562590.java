import java.util.*;

class Num implements Comparable<Num>{
	int v;
	int id;
	boolean isOddPos = false;
	
	public Num(int v, int id) {
		this.v = v;
		this.id = id;
	}
	
	public void check() {
		
	}

	@Override
	public int compareTo(Num that) {
		return this.v - that.v;
	}
}

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Num[] a = new Num[n];
		for(int i = 0; i < n; i++) {
			a[i] = new Num(sc.nextInt(), i);
		}
		
		sc.close();
		
		Arrays.sort(a);
		
		for(int i = 0; i < n; i += 2) {
			a[i].isOddPos = true;
		}
		
		for(int i = 0; i < n; i += 2) {
			a[i].isOddPos = true;
		}
		
		int ans = 0;
		for(int i = 0; i < n; i++) {
			if(a[i].isOddPos) {
				if(a[i].id%2 != 0) ans++;
			} else {
				if(a[i].id%2 == 0) ans++;
			}
		}
		
		System.out.println(ans/2);
		
		return;
	}
	
}