import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		//String text = scan.next();
		int cun = 1;
		long sosuu[] = new long[10000];
		sosuu[0] = 2;
		for(long i = 3 ; i < 104730 ; i+=2){
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
		int n = scan.nextInt();
		while(n != 0){
			long sum = 2;
			for(int i = 1 ; i < n ; i++){
				sum += sosuu[i];
			}
			System.out.println(sum);
			n = scan.nextInt();
		}
	}
}