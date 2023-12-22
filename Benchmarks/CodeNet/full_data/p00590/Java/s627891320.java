import java.util.*;
import java.io.*;
import java.math.*;

class Main {
	
	static ArrayList<Integer> primeList = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		makePrimeList();
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int[] a = new int[n+1];
			int[] b = new int[n+1];
			for(int i = 0; i < n+1; i++) {
				a[i] = i+1;
				b[i] = n - i;
			}
			int count = 0;
			for(int i = 0; i < n+1; i++) {
				if(primeList.contains(a[i]) && primeList.contains(b[i])) {
					count++;
				}
			}
			System.out.println(count);
			
			
			
			
			
		}
	}
	static void makePrimeList() {
		boolean[] isntPrime = new boolean[10001];
		primeList.add(2);
		for(int i = 3; i < 10001; i += 2) {
			if(!isntPrime[i]) {
				primeList.add(i);
				for(int j = i + i; j < 10001; j += i) {
					isntPrime[j] = true;
				}
			}
		}
	}
}