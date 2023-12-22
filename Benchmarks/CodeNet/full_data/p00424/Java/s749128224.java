import java.io.PrintWriter;
import java.util.Scanner;
class Mian{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		PrintWriter out = new PrintWriter(System.out);
		while(sc.hasNext()){
			int m = sc.nextInt();
			if(m == 0)break;
			String temp [][] = new String[2][m];
			for (int i = 0; i < m ; i++ ){
				temp[0][i] = sc.next();
				temp[1][i] = sc.next();
			}
			int n = sc.nextInt();
			String ans = "";
			for(int i = 0 ; i < n ; i++){
				ans = sc.next();
				for(int j = 0 ; j < m ; j++){
					if(( temp[0][j].equals(ans) )){
						ans = temp[1][j];
						break;
					}
				}
				out.print(ans);
			}
			out.println();
			out.flush();
		}
	}
}