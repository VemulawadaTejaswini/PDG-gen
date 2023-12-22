import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x,y;
		try{
			while((x = scn.nextInt()) != 0 && (y = scn.nextInt()) != 0) {
				System.out.println((x < y)?x + " " + y:y + " " + x);
			}
		}catch(Exception e) {

		}
		scn.close();
	}
}

