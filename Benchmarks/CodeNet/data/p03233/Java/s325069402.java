import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n],b=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		long x = 0;
		for(int i=0;i<n;i++) {
			if(b[n-1-i] < a[i]) {
				a[i] = b[n-1-i];
			}
			x += a[i];
		}
		pl(x);
	}
	
	static void pl(Object o){System.out.println(o);}
}