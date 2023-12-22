import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args){ 
		Scanner cin = new Scanner(System.in);
		int N=cin.nextInt();
		int M=cin.nextInt();
		int[] field = new int[N + 1000];
		for(int i = 0;i<N;i++){
			field[i]=cin.nextInt();
		}
		int[] dice = new int[M];
		for(int i = 0;i<M;i++){
			dice[i]=cin.nextInt();
		}
		int now =  0;
		for(int i = 0;i<M;i++){
			now = now + dice[i] + field[now+dice[i]];
			if(now >= N-1){
				System.out.println(i+1);
				break;
			}
		}
	}

}