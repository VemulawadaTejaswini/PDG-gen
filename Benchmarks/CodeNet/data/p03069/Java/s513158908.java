import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N = keyboard.nextInt();
		String S = keyboard.next();
		
		String[] ishi = S.split("");
		
		int count = 0;
		
			for (int i = 1; i < S.length(); i++) {
					 if(ishi[i].equals("#")) {
						//no action
						 }else {
							 int mae = i-1;
							 if (ishi[mae].equals("#")) {
								 ishi[i] = "#";
								 count ++;
				 	}else{
						//no action
				 		}
				 	}
			}
		System.out.println(count);
		keyboard.close();
	}
}