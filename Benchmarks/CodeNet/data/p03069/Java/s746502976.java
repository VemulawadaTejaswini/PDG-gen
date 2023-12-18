import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N = keyboard.nextInt();
		String S = keyboard.next();
		
		String[] ishi = S.split("");
		
		int count1 = 0;
		
			for (int i = 1; i < S.length(); i++) {
				if(ishi[i].equals("#")) {
				 }else {
							 int mae = i-1;
							 if (ishi[mae].equals("#")) {
								 ishi[i] = "#";
								 count1 ++;
							 	}else{
							 }
				 }
			}
			
		String[] ishi2 = S.split("");
		
		int count2 = 0;
			
			for (int j = S.length() - 1; j > 0; j--) {
				if(ishi2[j].equals(".")) {
					int mae2 = j-1;
					 if (ishi2[mae2].equals("#")) {
						 ishi2[mae2] = ".";
						 count2 ++;	 
					 	}
				 }
			}	
			
			int kotae = 0;		
			kotae = count1 <= count2 ? count1 : count2;
			
		System.out.println(kotae);
		keyboard.close();
	}
}