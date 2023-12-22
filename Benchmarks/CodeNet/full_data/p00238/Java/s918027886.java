import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		int t = scan.nextInt();
		while(t != 0){
			int n = scan.nextInt();
			int sum = 0;
			int s;
			int f;
			for(int i = 0 ; i < n ; i++){
				s = scan.nextInt();
				f = scan.nextInt();
				sum += (f-s);
			}
			if(sum >= t){
				System.out.println("OK");
			}else{
				System.out.println(t-sum);
			}
			t = scan.nextInt();
		}
	}
}