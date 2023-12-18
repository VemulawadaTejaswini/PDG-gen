import java.util.*;
public class Main {
    /**
	 *
	 */

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int answer = Integer.MAX_VALUE;
        //A only
        if (y > x) {
            int candidate = y-x;
            answer = Math.min(candidate, answer);
        }
        //A-B
        int negY = -y;
        if (negY >= x) {
            int candidate = negY-x + 1;
            answer = Math.min(candidate, answer);
        }
        //B-A
        int negX = -x;
        if (y >= negX) {
            int candidate = y-negX + 1;
            answer = Math.min(candidate, answer);
        }
        //B-A-B
        if(negY - negX >= 0) {
            int candidate = negY-negX + 2;
            answer = Math.min(candidate, answer);
        }
        System.out.println(answer);
    }
}