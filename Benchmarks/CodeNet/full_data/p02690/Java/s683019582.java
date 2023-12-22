import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int X = keyboard.nextInt();
		all: for(int a=-1000; a<1001; a++) {
		 for(int b=-1000; b<1001; b++) {
			 if(X == Math.round(Math.pow(a, 5)-Math.pow(b, 5))) {
				 System.out.print(a+" "+b);
				 break all;
			 }
		 }
		}
		keyboard.close();
	}
}
