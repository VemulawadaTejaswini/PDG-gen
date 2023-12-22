import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();	//町の数
		int K = in.nextInt();	//テレポート回数
		int A[] = new int[N];	//町
		for(int i=0; i<N; i++){
			A[i] = in.nextInt();
		}
		int arrival = A[0];		//到着場所
		for(int i=1; i<K; i++){
			arrival = A[arrival-1];
		}
		System.out.println(arrival);
	}
}