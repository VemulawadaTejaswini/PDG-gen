import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.next());
		int Z = Integer.parseInt(in.next());
		int W = Integer.parseInt(in.next());
		int x = Z;
		int y = W;
		int[] a = new int[N];
		for (int i = 0; i < N; i++){
			a[i] = Integer.parseInt(in.next());
		}
		if(2<N)x = a[N-2];
		y = a[N-1];
		if(Math.abs(x-y)>Math.abs(y-W))System.out.println(Math.abs(x-y));
		else System.out.println(Math.abs(y-W));
	}
}