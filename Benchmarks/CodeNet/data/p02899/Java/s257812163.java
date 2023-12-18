//package atcoder;
 
import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i=0;i<N;i++) {
			A[sc.nextInt()-1] = i+1;
		}
		for(int j=0;j<N;j++) {
			System.out.print(A[j]+" ");
		}
	}
}