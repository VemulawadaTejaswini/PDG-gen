import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();
                long seki = 1;
                long limit = (long)Math.pow(10, 18);
                int temp;
                boolean isOver = false;

                for (int i = 0; i < N; i++) {
                	temp = scan.nextInt();
                	if (seki <= (double)limit/temp) {
                		seki *= temp;
                	} else {
                		isOver = true;
                		break;
                	}
                }
                
                if (isOver) {
                	System.out.println(-1);
                } else {
                	System.out.println(seki);
                }
        }

}