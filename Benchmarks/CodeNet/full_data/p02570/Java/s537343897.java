import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int T = sc.nextInt();
        int S = sc.nextInt();
    
        boolean result = (S*T >= D);

        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    private static boolean ableToMove(int t_old, int x_old, int y_old, int t_new, int x_new, int y_new) {
        int x_distance = (x_old > x_new) ? (x_old - x_new) : (x_new - x_old);
        int y_distance = (y_old > y_new) ? (y_old - y_new) : (y_new - y_old);
        int distance = x_distance + y_distance;

        int lapse = t_new - t_old;
        if (distance > lapse) {
            return false;
        }
        if ((lapse - distance) % 2 != 0) {
            return false;
        }
        return true;
    }
}
