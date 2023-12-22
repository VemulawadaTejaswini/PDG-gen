import java.math.BigInteger;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int input = Integer.parseInt(x);

        
        BigInteger ten = new BigInteger("10");
        BigInteger nine = new BigInteger("9");
        BigInteger eight = new BigInteger("8");
        BigInteger wari = new BigInteger("1000000007");

        //BigDecimal tenBeki =  ten.pow(input);
        //BigDecimal nineBeki =  nine.pow(input).multiply(new BigDecimal(2));
        //BigDecimal eightBeki =  eight.pow(input);

        BigInteger answer = ten.pow(input).
        subtract(nine.pow(input).multiply(new BigInteger("2"))).add(eight.pow(input));
        answer = answer.remainder(wari);
        System.out.println(answer);
    }
}
