import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int five = 2;
		int seven = 1;
		while(scan.hasNext()) {
			if(scan.nextInt() == 5) {
				five -= 1;
			}else if(scan.nextInt() == 7) {
				seven -= 1;
			}
		}
		if(five == 0 && seven == 0) {
			System.out.print("YES");
		}else {
			System.out.println("no");
		}


	}

}
