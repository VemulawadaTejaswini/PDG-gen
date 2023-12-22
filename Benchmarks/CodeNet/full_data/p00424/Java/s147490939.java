import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);

		int n = 0;
		int m = 0;
		String conv[] = new String[124];

		while (true){
			n = Integer.parseInt(std.next());
			if (n==0){break;}

			Arrays.fill(conv, "");
			for(int i=0; i<2*n; i+=2){
				conv[i] = std.next();
				conv[i+1] = std.next();
			}

			m = Integer.parseInt(std.next());
			String nextchar = "";
			String answer = "";
			for(int j=0; j<m; j++){
				nextchar = std.next();
				for (int i=0; i<2*n; i+=2){
					if (nextchar==conv[i]){
						nextchar = conv[i+1];
						break;
					}
				}
				answer += nextchar;
			}
			System.out.println(answer);
		}

	}
}