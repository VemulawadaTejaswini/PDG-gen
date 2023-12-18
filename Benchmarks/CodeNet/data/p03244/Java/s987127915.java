import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		for(int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		int[] a = new int[100001];
		int[] b = new int[100001];
		for(int i = 0; i < n; i++) {
			if(i%2 == 0) {
				a[v[i]]++;
			} else {
				b[v[i]]++;
			}
		}
		int countA = 0;
		int numA = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] > countA) {
				countA = a[i];
				numA = i;
			}
		}
		int countB = 0;
		int numB= 0;
		for(int i = 0; i < b.length; i++) {
			if(b[i] > countB) {
				countB = b[i];
				numB = i;
			}
		}
	    Arrays.sort(a);
	    Arrays.sort(b);
	    if(numA != numB){
	        System.out.println(n-a[100000]-b[100000]);
	      }else{
	        System.out.println(Math.min(n-a[100000]-b[99999], n-a[99999]-b[100000]));
	      }
	}
}