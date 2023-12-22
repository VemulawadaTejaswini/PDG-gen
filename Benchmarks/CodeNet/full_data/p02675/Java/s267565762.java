import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int number = 0;
		number = N % 10;
		if(number == 2 || number == 4 || number == 5 || number == 7 || number == 9) {
			System.out.println("hon");
		}else if(number == 0 || number == 1 || number == 6 || number == 8) {
			System.out.println("pon");
		}else if(number == 3) {
			System.out.println("bon");
		}
  }
}