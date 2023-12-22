import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		//String text = scan.next();
		int n = scan.nextInt();
		while(n != 0){
			int cun = 1;
			long sosuu[] = new long[10000];
			sosuu[0] = 2;
			for(long i = 3 ; i < 104724 ; i++){
				int kensa = 0;
				for(long j = 2 ; j < i ; j++){
					if(i % j == 0){
						kensa = 1;
						break;
					}
				}
				if(kensa == 0){
					sosuu[cun] = i;
					++cun;
				}
			}
			long sum = 0;
			for(int i = 0 ; i < n ; i++){
				sum += sosuu[i];
			}
			System.out.println(sum);
			n = scan.nextInt();
		}
	}
}