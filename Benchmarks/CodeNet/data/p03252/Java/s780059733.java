import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		sc.close();

		String[][] count = new String[2][26];
		String[][] count2 = new String[2][26];
		int i = 0;
		for ( char c = 'a';c < ('a' + 26);c++) {
		    count[0][i] = String.valueOf(c);
		    count[1][i] = "-";
		    count2[0][i] = String.valueOf(c);
		    count2[1][i] = "-";
		    i++;
		}

		String ans ="Yes";
		for(int j = 0 ; j < S.length() ; j++){
			for(int k = 0 ; k < 26 ; k++){
				if(count[0][k].equals(S.substring(j, j+1)) && count[1][k].equals("-")){
					count[1][k] = T.substring(j, j+1);
					break;
				}
				else if(count[0][k].equals(S.substring(j, j+1)) && !count[1][k].equals(T.substring(j,j+1))){
					//System.out.println(k + " "+j + " " + 1);
					ans = "No";
					break;
				}
			}
		}

		for(int j = 0 ; j < T.length() ; j++){
			for(int k = 0 ; k < 26 ; k++){
				if(count2[0][k].equals(T.substring(j, j+1)) && count2[1][k].equals("-")){
					count2[1][k] = S.substring(j, j+1);
					break;
				}
				else if(count2[0][k].equals(T.substring(j, j+1)) && !count2[1][k].equals(S.substring(j,j+1))){
					//System.out.println(k + " "+j + " " + count2[1][k]  + " " + S.substring(j,j+1));
					ans = "No";
					break;
				}
			}
		}
		System.out.println(ans);

/*

		for(int k = 0 ; k < 26 ; k++){
				System.out.println(count2[0][k] + " " + count2[1][k]);
		}
*/
	}
}