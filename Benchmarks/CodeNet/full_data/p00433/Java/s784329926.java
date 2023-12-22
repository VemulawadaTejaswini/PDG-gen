import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		//String text = scan.next();
		int sam[] = {0,0};
		for(int i = 0; i < 2 ; i++){
			for(int j = 0 ; j < 4 ; j++){
				sam[i] += scan.nextInt();
			}
		}
		if(sam[0] >= sam[1]){
			System.out.println(sam[0]);
		}else{
			System.out.println(sam[1]);
		}
	}
}