import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		int counter = 1;
		int[] A = new int[N];
		int ans = 0;
		for(int i = 0;i < N;i++){
			A[i] = sc.nextInt() - 1;
		}
		int pointer = A[0];
		while(pointer != 0){
			pointer = A[pointer];
			counter++;
		}
		long buf = K % counter;
		for(int i = 0;i < buf;i++){
			ans = A[ans];
		}
		System.out.println((ans + 1));
	}
}