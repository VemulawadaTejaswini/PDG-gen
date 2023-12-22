import java.util.*;

public class Main{
	public static void main(String[] args) {
		int num = new Scanner(System.in).nextInt();
			switch(num % 10){
				case 2:
				case 4:
				case 5:
				case 7:
				case 9:
				System.out.println("hon");
				case 0:
				case 1:
				case 6:
				case 8:
				System.out.println("pon");
				case 3:
				System.out.println("bon");
		}
	}
}