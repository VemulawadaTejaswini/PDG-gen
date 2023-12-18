import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();

		String[][] count = new String[2][26];
		int i = 0;
		for ( char c = 'a';c < ('a' + 26);c++) {
		    count[0][i] = String.valueOf(c);
		    count[1][i] = "0";
		    i++;
		}

		for(int j = 0 ; j < N ; j++){
			String T = S.substring(j, j+1);
			for(int k = 0 ; k < 26 ; k++){
				if(T.equals(count[0][k])){
					count[1][k] = String.valueOf(Integer.parseInt(count[1][k]) + 1);
				}
			}
		}

/*
		for(int j = 0 ; j < 2 ; j++){
			for(int k = 0 ; k < 26 ; k++){
				System.out.print(count[j][k] + " ");
			}
			System.out.println("");
		}
*/
		long ans =1;

		for(int j = 0 ; j < N ; j++){
			ans = (ans*(Long.parseLong(count[1][j]) + 1))%1000000007;
		}
		System.out.println(ans-1);
	}
}
