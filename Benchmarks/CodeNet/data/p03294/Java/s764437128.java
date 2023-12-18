import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; ++i){
			a[i] = scn.nextInt();
		}
		long m = 1;
		for(int i=0; i<a.length; ++i){
			m = m * a[i];
		}
      	m = m - 1;
		int sum = 0;
		for(int i=0; i<a.length; ++i){
			sum = sum + m % a[i];
		}
		System.out.println(sum);
	}
}