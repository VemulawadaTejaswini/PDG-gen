import java.util.*;
import java.math.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger x = new BigInteger(String.valueOf(sc.nextBigInteger()));

        BigInteger array[] = new BigInteger[6002];

        for (int i = 0; i <= 3000; i++) {
            array[i] = BigInteger.valueOf(i * i * i * i * i);
        }

        for (int i = 0; i <= 3000; i++) {
            array[i + 3001] = BigInteger.valueOf(-i * i * i * i * i);
        }

        for (int i = 0; i < 6002; i++) {
            for (int j = 0; j < 6002; j++) {
                if ((array[i].subtract(array[j])).compareTo(x) == 0) {
                    if (i >= 3001) {
                        i = -i + 3001;
                    }

                    if (j >= 3001) {
                        j = -j + 3001;
                    }

                    System.out.println(String.valueOf(i) + " " + String.valueOf(j));
                    return;
                }

            }
        }




        sc.close();
    }

}