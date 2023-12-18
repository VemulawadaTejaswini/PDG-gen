import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int s = in.nextInt();

        int x = 0;
        int y = 0;
        int z = 0;

        int count = 0;

        while (z <= k) {
            int currS = s-z;
            x = 0;
            // find the combination of x and y which add to the current value
            while (x <= k) {
                y = 0;
                // for each value of x want to increment y
                while (y <= k) {

                    if (x + y == currS) {
                        count++;
                        break;
                    }
                    y ++;
                }
                x ++;
            }
            z ++;
        }
        System.out.println(count);
    }
}