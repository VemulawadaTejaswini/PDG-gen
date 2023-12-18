import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int point = getPoint(x) + getPoint(y);
		if (x == 1 && y == 1) {
		    point += 400000;
		}
		System.out.println(point);
   }
   
   static int getPoint(int score) {
       if (score == 1) {
           return 300000;
       } else if (score == 2) {
           return 200000;
       } else if (score == 3) {
           return 100000;
       } else {
           return 0;
       }
   }

}

