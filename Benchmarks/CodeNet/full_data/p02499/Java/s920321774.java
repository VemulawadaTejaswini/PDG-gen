import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int c;
		int count[] = new int[0x80];

		for(c = 'a'; c <= 'z'; c++){
			count[c] = 0;
		}

		while(System.in.available() > 0){
			try{
				c = System.in.read();
			}
			catch(Exception e){
				c = 0;
			} 
			if('A' <= c && c <= 'Z'){
				count[c] -= ('A' - 'z');
			}
			if('a' <= c && c <= 'z'){
				count[c] ++;
			}
		}

		for(c = 'a'; c <= 'z'; c++){
			System.out.println(String.format("%c : %d", c, count[c]));
		}
		
	}
}