import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			int counter = 0;
			for(int i = 1; i < n; i++) {
				if(sorv(i,n)) {
					counter++;
				}
			}
			System.out.println(counter);
		}
	}
	
	public static boolean sorv(int i,int n) {
		int p = i++;
		while(true) {
			p += i++;
			if(p == n) return true;
			if(p > n) return false;
		}
	}

}