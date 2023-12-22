import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();
                long seki = 1;
                long limit = (long)Math.pow(10, 18);
                long temp;
                boolean isOver = false;
                boolean isZero = false;
                long[] A = new long[N];

                for (int i = 0; i < N; i++) {
                	A[i] = scan.nextLong();
                	if (A[i] == 0) {
                		isZero = true;
                	}
                }

                for (int i = 0; i < N; i++) {
                	temp = A[i];
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

                if (isZero) {
                	System.out.println(0);
                } else if (isOver) {
                	System.out.println(-1);
                } else {
                	System.out.println(seki);
                }
        }

}