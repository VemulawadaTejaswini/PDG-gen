import java.util.*;

public class taskA {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int totalNights, numFirst, numSubsequent;
                int priceFirst, priceSubsequent;

                totalNights = sc.nextInt();
                numFirst = sc.nextInt();
                numSubsequent = totalNights - numFirst;
                priceFirst = sc.nextInt();
                priceSubsequent = sc.nextInt();
                if (totalNights < numFirst) {
                        numFirst = totalNights;
                        numSubsequent = 0;
                }

                System.out.println(numFirst*priceFirst + numSubsequent*priceSubsequent);

        }