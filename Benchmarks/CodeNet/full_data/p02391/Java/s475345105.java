import java.io.*;
import java.util.Scanner;

class Main{
	public static void main(String[] args) throws IOException{
	
		Scanner x = new Scanner(System.in);
	
		int a = x.nextInt();
		int b = x.nextInt();
		if(a < b){
			System.out.println("a < b");
		else(a > b){
			System.out.println("a > b");
		else("a == b");
			System.out.println("a == b");
		}
	}
}