import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		int i1 = 1;
		int i2 = n;
		int c1 = 0;
		int c2 = 0;
		for(int i=0;i<n;i++) {
			if(a[i] == i1) {
				i1++;
				c1++;
			}
			if(a[n-1-i] == i2) {
				i2--;
				c2++;
			}
		}
		int o = c1;
		if(c2 > o) {
			o = c2;
		}
		o = n - o;
		
		System.out.println(o);
	}
}