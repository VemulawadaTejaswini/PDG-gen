import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int h = sc.nextInt();
    	int m = sc.nextInt();
    	double minutesHand = m * 6;
    	double hourHand = h * 30 + m * 0.5;
    	double longth = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(minutesHand - hourHand)));
    	System.out.println(longth);
    }
}
