
import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String N = sc.next();
		String M = sc.next();

		sc.close();

		String[][] memo = new String[N.length()+1][M.length()+1];
		for(String[] x : memo){
			Arrays.fill(x, "");
		}

		for(int i = 1 ; i <= N.length() ; i++){
			for(int j = 1 ; j <= M.length(); j++){
				if(N.substring(i-1, i).equals(M.substring(j-1, j))){
					memo[i][j] = memo[i-1][j-1] + N.substring(i-1,i);
				}
				else{
					if(memo[i-1][j].length() > memo[i][j-1].length()){
						memo[i][j] = memo[i-1][j];
					}
					else{
						memo[i][j] = memo[i][j-1];
					}
				}


			}
		}
/*
	for(int i = 1 ; i <= N.length() ; i++){
		for(int j = 1 ; j <= M.length(); j++){
			System.out.print(memo[i][j]+ " ");
		}
		System.out.println();
	}
*/

			System.out.println(memo[N.length()][M.length()]);

	}
}