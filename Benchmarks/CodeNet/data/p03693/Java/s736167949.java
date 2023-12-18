import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		 Scanner INPUT_R = new Scanner(System.in);
		 int R = INPUT_R.nextInt();

		 Scanner INPUT_G = new Scanner(System.in);
		 int G = INPUT_G.nextInt();

		 Scanner INPUT_B = new Scanner(System.in);
		 int B = INPUT_B.nextInt();

		 if(((R * 100) + (G * 10) + B) % 4 ==0) {
			 System.out.println("Yes");
		 }else {
			 System.out.println("NO");
		 }

	}
}