import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		//String text = scan.next();
		int h[][] = new int[3][2];
		int m[][] = new int[3][2];
		int s[][] = new int[3][2];
		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 2 ; j++){
				h[i][j] = scan.nextInt();
				m[i][j] = scan.nextInt();
				s[i][j] = scan.nextInt();
			}
		}
		for(int i = 0 ; i < 3 ; i++){
			int byou = h[i][1]*3600+m[i][1]*60+s[i][1]-(h[i][0]*3600+m[i][0]*60+s[i][0]);
			h[i][0] = byou/3600;
			m[i][0] = (byou % 3600)/60;
			s[i][0] = (byou % 3600)%60;
		}
		for(int i = 0 ; i < 3 ; i++){
			System.out.println(h[i][0] + " "+ m[i][0] +" "+ s[i][0]);
		}
	}
}