import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] order = new int[N];
		for(int i = 0; i < N; i++){
			order[sc.nextInt() - 1] = i + 1;
		}
		for(int i = 0; i < N; i++){
			System.out.print(order[i] + ((i != N - 1)?" ":""));
		}
		System.out.println();
	}
}