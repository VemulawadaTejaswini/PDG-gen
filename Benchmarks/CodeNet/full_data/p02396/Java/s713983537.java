import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i = 1;
		try{
			while(true) {
				System.out.println("Case " + i + ": " + scn.nextInt());
				i++;
			}
		}catch(Exception e) {
			scn.close();
		}
	}
}
