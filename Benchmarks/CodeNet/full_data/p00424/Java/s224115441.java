import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		
		int n = 0;
		int m = 0;
		
		while (true){
			n = Integer.parseInt(std.next());
			if (n==0){break;}
			
			String conv[][] = new String[2][n];
			for(int i=0; i<n; i++){
				conv[0][i] = std.next();
				conv[1][i] = std.next();
			}
			
			m = Integer.parseInt(std.next());
			String nextchar = "";
			String answer = "";
			for(int j=0; j<m; j++){
				nextchar = std.next();
				for (int i=0; i<n; i++){
					if (nextchar==conv[0][i]){
						nextchar = conv[1][i];
						break;
					}
				}
				answer += nextchar;
			}
			System.out.println(answer);
		}
		
	}
}