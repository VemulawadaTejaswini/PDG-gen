import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		int n = scan.nextInt();
		int sintyou[] = new int[6];
		for(int i = 0 ; i < n ; i++){
			double hito = scan.nextDouble();
			if(hito >= 185.0){
				++sintyou[5];
			}else if(hito >= 180.0){
				++sintyou[4];
			}else if(hito >= 175.0){
				++sintyou[3];
			}else if(hito >= 170.0){
				++sintyou[2];
			}else if(hito >= 165.0){
				++sintyou[1];
			}else{
				++sintyou[0];
			}
		}
		for(int i = 0 ; i < 6 ; i++){
			System.out.print(i+1 + ":");
			for(int j = 0 ; j < sintyou[i] ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}