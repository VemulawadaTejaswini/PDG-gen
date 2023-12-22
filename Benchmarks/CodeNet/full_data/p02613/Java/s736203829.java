import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();

                int[] s = {0, 0, 0, 0};

                for (int i = 0; i < N; i++) {
                	String temp = scan.next();
                	if (temp.equals("AC")) {
                		s[0]++;
                	} else if (temp.equals("WA")) {
                		s[1]++;
                	} else if (temp.equals("TLE")) {
                		s[2]++;
                	} else if (temp.equals("RE")) {
                		s[3]++;
                	}
                }

                System.out.println("AC x " + s[0]);
                System.out.println("WA x " + s[1]);
                System.out.println("TLE x " + s[2]);
                System.out.println("RE x " + s[3]);

                scan.close();

        }

}