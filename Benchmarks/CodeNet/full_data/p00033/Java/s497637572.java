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
		int tama[] = new int[10];
		int hantei;
		String kekka[] = new String[n];
		for(int i = 0 ; i < n ; i++){
			hantei = 0;
			int b = 0;
			int c = 0;
			for(int j = 0 ; j < 10 ; j++){
				tama[j] = scan.nextInt();
			}
			for(int j = 0 ; j < 10 ; j++){
				if(b < tama[j]){
					b = tama[j];
				}else if(c < tama[j]){
					c = tama[j];
				}else{
					kekka[i] = "NO";
					hantei++;
					break;
				}
			}
			if(hantei == 0){
				kekka[i]="YES";
			}
		}
		for(int i = 0 ; i < n ; i++){
			System.out.println(kekka[i]);
		}
	}
}