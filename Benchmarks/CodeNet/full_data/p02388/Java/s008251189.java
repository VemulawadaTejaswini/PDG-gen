
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {
            BigInteger inputNum = BigInteger.valueOf(Long.parseLong(scanner.next()));
            System.out.println(inputNum.pow(3));
        }
    }
}