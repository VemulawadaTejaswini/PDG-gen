import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();
                long seki = 1;
                long limit = (long)Math.pow(10, 18);
                long temp;
                double sekiwaru;
                boolean isOver = false;

                for (int i = 0; i < N; i++) {
                	temp = scan.nextLong();
                	if (limit%temp == 0) {
                		if (seki <= limit/temp) {
                			seki *= temp;
                		} else {
                			isOver = true;
                    		break;
                		}
                	} else {
                		if (seki <= limit/temp - 1) {
                			seki *= temp;
                		} else {
                			isOver = true;
                    		break;
                		}
                	}
                }

                if (isOver) {
                	System.out.println(-1);
                } else {
                	System.out.println(seki);
                }
        }

}