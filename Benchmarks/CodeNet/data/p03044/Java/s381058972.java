import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[][] A = new int[N][3];

		for(int i = 1 ; i < N ; i++){
			A[i][0] = sc.nextInt();
			A[i][1] = sc.nextInt();
			A[i][2] = sc.nextInt();
		}

		sc.close();

		int[] colors = new int[N+1];
		Arrays.fill(colors, -1);

		for(int i = 1 ; i < N ; i++){
			if(A[i][2]%2 == 0 && (colors[A[i][0]] == -1 && colors[A[i][1]] == -1)){
				colors[A[i][0]] = 0;
				colors[A[i][1]] = 0;
			}
			else if(A[i][2]%2 == 0 && (colors[A[i][0]] == -1 || colors[A[i][1]] == -1)){
				if(colors[A[i][0]] == -1){
					colors[A[i][0]] = colors[A[i][1]];
				}
				if(colors[A[i][1]] == -1){
					colors[A[i][1]] = colors[A[i][0]];
				}
			}
			else if(A[i][2]%2 != 0 && (colors[A[i][0]] == -1 && colors[A[i][1]] == -1)){
				colors[A[i][0]] = 0;
				colors[A[i][1]] = 1;
			}
			else if(A[i][2]%2 != 0 && (colors[A[i][0]] == -1 || colors[A[i][1]] == -1)){
				if(colors[A[i][0]] == -1){
					colors[A[i][0]] = reverse(colors[A[i][1]]);
				}
				if(colors[A[i][1]] == -1){
					colors[A[i][1]] = reverse(colors[A[i][0]]);
				}
			}
		}

		for(int i = 1 ; i <= N ; i++){
			System.out.println(colors[i]);
		}



	}
	static int reverse(int a){
		if(a == 1){
			return 0;
		}
		else{
			return 1;
		}
	}
}
