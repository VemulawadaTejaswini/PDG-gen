import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                long X = scan.nextLong();
                long K = scan.nextLong();
                long D = scan.nextLong();

                long output = 0;

                long nearZeroMoveNum = Math.abs(X / D);

                if (K <= nearZeroMoveNum) {
                	if (X >= 0) {
                		output = Math.abs(X - D * K);
                	} else {
                		output = Math.abs(X + D * K);
                	}
                } else {
                	if (X >= 0) {
                		if (Math.abs(X - D * nearZeroMoveNum) < Math.abs(X - D * nearZeroMoveNum - D) && nearZeroMoveNum%2 == K%2) {
                			output = Math.abs(X - D * nearZeroMoveNum);
                		} else {
                			output = Math.abs(X - D * nearZeroMoveNum - D);
                		}
                	} else {
                		if (Math.abs(X + D * nearZeroMoveNum) < Math.abs(X + D * nearZeroMoveNum + D) && nearZeroMoveNum%2 == K%2) {
                			output = Math.abs(X + D * nearZeroMoveNum);
                		} else {
                			output = Math.abs(X + D * nearZeroMoveNum + D);
                		}
                	}
                }

                System.out.println(output);

                scan.close();

        }

}