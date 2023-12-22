
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        String[] str1 = c.nextLine().split(" ");
        String[] str2 = c.nextLine().split(" ");
        String str3 = c.nextLine();

        long firstPositionA = Long.parseLong(str1[0]);
        long firstPositionB = Long.parseLong(str2[0]);
        long v = Long.parseLong(str1[1]);
        long w = Long.parseLong(str2[1]);

        long t = (firstPositionB - firstPositionA) / (v - w);
        t--;

        BigInteger positionA = new BigInteger(v + "");
        positionA = positionA.multiply(new BigInteger(t + ""));
        positionA = positionA.add(new BigInteger(firstPositionA + ""));

        BigInteger positionB = new BigInteger(w + "");
        positionB = positionB.multiply(new BigInteger(t + ""));
        positionB = positionB.add(new BigInteger(firstPositionB + ""));

        if (positionA.subtract(new BigInteger(v + "")).compareTo(positionB.subtract(new BigInteger(w + ""))) <= 0
                && positionA.add(new BigInteger(v + "")).compareTo(positionB.add(new BigInteger(w + ""))) >= 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
