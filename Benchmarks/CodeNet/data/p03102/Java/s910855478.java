import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		int count =0;
		int sum =0;
		int [] hairetuB = new int[M];
		for(int i=0;i<M;i++){
			hairetuB[i] = sc.nextInt();
		}
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				int A =sc.nextInt();
				sum = sum +hairetuB[j]*A;
			}
			if(sum+C>0){
				count++;
			}
			sum=0;
		}
		System.out.println(count);
	}
}
