import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		int n = scan.nextInt();
		int tensuu[] = new int[n];
		String action;
		for(int i = 0 ; i < n ; i++){
			int out = 0;
			int rui = 0;
			while(out < 3){
				action = scan.next();
				if(action.equals("OUT")){
					++out;
				}else if(action.equals("HIT")){
					++rui;
					if(rui == 4){
						++tensuu[i];
						rui = 3;
					}
				}else{
					tensuu[i] += rui+1;
					rui = 0;
				}
			}
		}
		for(int i = 0 ; i < n ; i++){
			System.out.println(tensuu[i]);
		}
	}
}