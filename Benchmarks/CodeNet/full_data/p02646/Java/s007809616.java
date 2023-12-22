import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long V = sc.nextLong();
		long B = sc.nextLong();
		long W = sc.nextLong();
		long T = sc.nextLong();
		for(long i = 0; i < T; i++){
			A += V;
			B += W;
			if(B <= A){
				System.out.print("YES");
				return;
			}
		}
		System.out.print("NO");
	}
}