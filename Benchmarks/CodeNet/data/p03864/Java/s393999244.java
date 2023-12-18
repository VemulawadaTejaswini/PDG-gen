import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];
		int s = 0;
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
			s += a[i];
		}
		a[0] = Math.min(a[0], x);
		for(int i=1; i<n; i++){
			a[i] = Math.min(a[i], x-a[i-1]);
			s -= a[i];
		}
		System.out.println(s-a[0]);
	}
}