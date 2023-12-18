import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int D = scan.nextInt();
		 int N = scan.nextInt();
		 
		 int cnt = 1;
		 int index = 1;
		 
		 while (cnt < N) {
			 if (index * Math.pow(100,D) % Math.pow(100, D + 1) != 0) {
				 cnt += 1;
			 }
			 index += 1;
		 }
		 
		 System.out.println((int)(index * Math.pow(100, D)));
		 scan.close();

	}

}
