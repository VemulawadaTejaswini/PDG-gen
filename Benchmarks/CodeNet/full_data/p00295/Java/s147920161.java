import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		for(int i = 0; i < n; i++) {
			int[] a = new int[31];
			for(int j = 1; j < 31; j++) {
				a[j] = stdIn.nextInt();
			}
			System.out.println(solv(a,0));
		}
	}
	
	static int solv(int[] ck, int count) {
		if(check(ck)) {
			return count;
		}
		if(count >= 9) return 99;
		int max = 20;
		int[] a = ck;
		int[] b = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		swap(a,1,28);
		swap(a,2,29);
		swap(a,3,30);
		swap(a,15,16);
		swap(a,21,19);
		max = Math.min(solv(a,count+1),max);
		for(int i = 0; i < a.length; i++) {
			a[i] = b[i];
		}
		swap(a,7,22);
		swap(a,8,23);
		swap(a,9,24);
		swap(a,13,18);
		swap(a,10,12);
		max = Math.min(solv(a,count+1),max);
		for(int i = 0; i < a.length; i++) {
			a[i] = b[i];
		}
		swap(a,1,24);
		swap(a,4,27);
		swap(a,7,30);
		swap(a,16,18);
		swap(a,10,21);
		max = Math.min(solv(a,count+1),max);
		for(int i = 0; i < a.length; i++) {
			a[i] = b[i];
		}
		swap(a,3,22);
		swap(a,6,25);
		swap(a,9,28);
		swap(a,12,19);
		swap(a,13,15);
		max = Math.min(solv(a,count+1),max);
		
		return max;
	}
	
	static void swap(int[] a, int f, int t) {
		int tmp = a[f];
		a[f] = a[t];
		a[t] = tmp;
	}
	
	static boolean check(int[] a) {
		int b = a[1];
		for(int i = 1; i < 10; i++) {
			if(b != a[i]) {
				return false;
			}
		}
		b = a[22];
		for(int i = 23; i < 31; i++) {
			if(b != a[i]) {
				return false;
			}
		}
		if(a[10] != a[12]) return false;
		if(a[13] != a[15]) return false;
		if(a[18] != a[16]) return false;
		if(a[21] != a[19]) return false;
		if(a[14] != a[15]) return false;
		if(a[11] != a[12]) return false;
		if(a[17] != a[18]) return false;
		if(a[21] != a[20]) return false;
		
		return true;
	}
}
		