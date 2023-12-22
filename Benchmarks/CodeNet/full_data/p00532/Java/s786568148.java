import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int score[] = new int[N];
		int target[] = new int[M];
		for(int i = 0 ; i < M ; i++){
			target[i] = scan.nextInt();
		}
		int game[] = new int[N];
		for(int i = 0 ; i < M ; i++){
			for(int j = 0 ; j < N ; j++){
				game[j] = scan.nextInt();
			}
			int cun = 0;
			for(int j = 0 ; j < N ; j++){
				if(target[i] == game[j]){
					score[j]++;
				}else{
					cun++;
				}
			}
			score[target[i]-1] += cun;
		}
		for(int i = 0 ; i < N ; i++){
			System.out.println(score[i]);
		}
	}
}