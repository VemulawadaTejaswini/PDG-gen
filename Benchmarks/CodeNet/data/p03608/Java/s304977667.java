
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	int N = in.nextInt();
	int M = in.nextInt();
	int R = in.nextInt();

	int town[] = new int[R];

	int road[][] = new int[N+1][N+1];

	int sum = 0;

	for(int[] x:road){
		Arrays.fill(x, 100001);
	}


	//行く街を取得
	for(int cnt = 0; cnt < R; cnt++){
		town[cnt] = in.nextInt();
	}
	Arrays.sort(town);
	//道を取得
	for(int cnt = 0; cnt < M; cnt++){
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		if(a > b){
			int tmp = a;
			a = b;
			b = tmp;
		}
		if(c < road[a][b]){
			road[a][b] = c;
		}
	}

	for(int cnt = 0; cnt < R - 1; cnt++){
		sum = sum + road[town[cnt]][town[cnt+1]];
	}

	in.close();

	System.out.println(sum);
	}
}