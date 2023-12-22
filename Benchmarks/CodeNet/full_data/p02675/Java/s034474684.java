import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int one = n % 10;
      if (one == 2 || one == 4 || one == 5 || one == 7 || one == 9) {
        System.out.println("hon");
      } else if (one == 0 || one == 1 || one == 6 || one == 8) {
        System.out.println("pon");
      } else {
        System.out.println("bon");
      }
	}
}