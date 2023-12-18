import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal a = new BigDecimal(sc.next());
        BigDecimal b = new BigDecimal(sc.next());
        BigDecimal n = new BigDecimal(sc.next());

        BigDecimal x = new BigDecimal("0");
        int counter = 0;

        BigDecimal firstBlock = (a.multiply(x).divide(b, 0, RoundingMode.DOWN)).setScale(0, RoundingMode.DOWN);
        BigDecimal secondBlock = a.multiply((x.divide(b, 0, RoundingMode.DOWN)).setScale(0,RoundingMode.DOWN));

        BigDecimal firstAnswer = firstBlock.subtract(secondBlock);
        while (counter<3){
            x = x.add(new BigDecimal("1"));
            firstBlock = (a.multiply(x).divide(b, 0, RoundingMode.DOWN)).setScale(0, RoundingMode.DOWN);
            secondBlock = a.multiply((x.divide(b, 0, RoundingMode.DOWN)).setScale(0,RoundingMode.DOWN));

            counter++;
            System.out.println(firstBlock.subtract(secondBlock));
            if(firstAnswer.compareTo(firstBlock.subtract(secondBlock))==-1){
                firstAnswer = firstBlock.subtract(secondBlock);
                counter = 0;
            }
        }
        System.out.println(firstAnswer.longValue());
    }
}
