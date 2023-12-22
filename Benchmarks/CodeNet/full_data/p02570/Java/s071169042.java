import java.util.*;

public class main {
	public static void main(String[] args){
 
        Scanner sc = null;
        sc = new Scanner(System.in);
        double d = sc.nextInt();
        int t = sc.nextInt();
        double s = sc.nextInt();
        sc.close();

        if (d / s <= t) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        } 
      }
}