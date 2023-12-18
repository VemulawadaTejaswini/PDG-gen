
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		boolean red[] = new boolean[n + 1];
		red[1] = true;
		int ball[] = new int[n + 1];
		Arrays.fill(ball, 1);
		for(int i = 0 ; i < m; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			ball[x]--;
			ball[y]++;

			if(red[x]){
				red[y] = true;

				if(ball[x] == 0){
					red[x] = false;
				}
			}

//			for(int j = 1; j <= n; j++){
//				System.out.print(red[j]+ " ");
//			}
//			System.out.println();
		}

//		for(int i = 1; i <= n; i++){
//			System.out.print(ball[i]+" ");
//		}
//		System.out.println();

		int count = 0;
		for(int i = 1; i < red.length; i++){
			if(red[i] && ball[i] != 0){
				count++;
			}
		}

		System.out.println(count);
	}

}
