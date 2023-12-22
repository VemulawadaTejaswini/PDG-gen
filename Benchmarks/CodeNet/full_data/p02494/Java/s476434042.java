import java.io.*;
import java.util.Scanner;

class Main {
	public static void main (String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		
		while (true) {
			int H = Integer.parseInt(in.next());
			int W = Integer.parseInt(in.next());
			
			if (H==0 && W == 0)
				break;
				
			for (int i=0; i<H; i++) {
				for (int j=0; j<W; j++) {
					System.out.print("#");
				}
				System.out.println("");
			}			
		}
	}
}