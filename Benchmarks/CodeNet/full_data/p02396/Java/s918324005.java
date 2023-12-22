import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException{
		//
		int[] data = new int[10001];
		Scanner input = new Scanner(System.in);
		for(int i=0; i < 10001; i++){
			String str = input.nextLine();
			data[i] = Integer.parseInt(str);
			if( data[i] == 0){
				break;
			}
		}
		
		
		
		for(int i=0; i < 10001; i++){
			if( data[i] == 0){
				break;
			}
			System.out.println("Case "+ (i+1) + ": " + data[i]);
		}
		//
	}
}