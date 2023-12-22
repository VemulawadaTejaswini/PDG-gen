import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                String S = scan.next();
                String T = scan.next();

                int output = T.length();

                for (int i = 0; i <= S.length() - T.length(); i++) {
                	String tempS = S.substring(i,i+T.length());
                	int tempCount = 0;
                	for (int k = 0; k < T.length(); k++) {
                		if (!tempS.substring(k,k+1).equals(T.substring(k,k+1))) {
                			tempCount++;
                		}
                	}
                	if (tempCount < output) {
                		output = tempCount;
                	}

                }

                System.out.println(output);

                scan.close();

        }

}