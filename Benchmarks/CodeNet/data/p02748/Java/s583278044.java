import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int M = sc.nextInt();
		int a[] = new int[A];
		int b[] = new int[B];
		int x[] = new int[M];
		int y[] = new int[M];
		int c[] = new int[M];
		int min = Integer.MAX_VALUE;
		int min_reizouko = Integer.MAX_VALUE;
		int min_renji = Integer.MAX_VALUE;
		for(int i=0;i<A;i++){
			a[i] = sc.nextInt();
			if(min_reizouko > a[i])min_reizouko = a[i];
		}
		for(int i=0;i<B;i++){
			b[i] = sc.nextInt();
			if(min_renji > b[i])min_renji = b[i];
		}
		for(int i=0;i<M;i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		min = min_reizouko + min_renji;
		for(int i=0;i<M;i++){
			int price = a[x[i]-1] + b[y[i]-1] - c[i];
			if(min>price)min = price;
		}
		System.out.println(min);
	}
}