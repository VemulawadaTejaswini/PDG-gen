import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner cin = new Scanner(System.in);

		int N = cin.nextInt();
		int M = cin.nextInt();
		int road[] = new int[M];
		Arrays.fill(road, 0);
		int tmp1,tmp2;
		for(int i=0;i<M;i++){
			tmp1 = cin.nextInt();
			tmp2 = cin.nextInt();
			road[tmp1] += 1;
			road[tmp2] += 1;
		}
		cin.close();

		for(int j=0;j<M;j++){
			System.out.println(road[j]);
		}
	}
}
