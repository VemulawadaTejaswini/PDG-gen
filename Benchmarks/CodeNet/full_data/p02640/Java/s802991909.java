import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		if(Y % 2 == 1) {
			System.out.println("No");
		}else if(Y > X * 4) {
			System.out.println("No");
		}else if(X == 0 && Y > 0 || Y == 0 && X > 0){
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
  }
}