import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	int a = input.nextInt();
    	int b = input.nextInt();
    	System.out.println((int)a/b+" "+a%b+" "+new BigDecimal(a/b).setScale(9,BigDecimal.ROUND_HALF_UP));
    }
}