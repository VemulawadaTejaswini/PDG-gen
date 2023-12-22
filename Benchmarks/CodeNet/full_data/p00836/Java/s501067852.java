import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
    
    
public class Main {
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		makePrimeList();
		int[] l = new int[list.size()+1];
		for(int i = 0; i < list.size(); i++) {
			l[i+1] = l[i] + list.get(i);
		}
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			int count = 0;
			for(int i = 0; i < l.length; i++) {
				for(int j = 0; j < i; j++) {
					if(l[i] - l[j] == n) count++;
					if(l[i] - l[j] <= n) break;
				}
			}
			System.out.println(count);
			
		}
		
	}
	static void makePrimeList() {
		boolean[] isntPrime = new boolean[10001];
		list.add(2);
		for(int i = 3; i < isntPrime.length; i += 2) {
			if(!isntPrime[i]) {
				list.add(i);
				for(int j = i + i; j < isntPrime.length; j += i) {
					isntPrime[j] = true;
				}
			}
		}
	}
	
}