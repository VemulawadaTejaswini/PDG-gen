import java.io.*;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by xs on 8/18/2016.
 */
public class Main{
    public static void main(String[] args){
       // System.out.println("Hello World!");
        BigDecimal pi=new BigDecimal ("3.141592653589793238462643383279502884197169399375105820974944592307816406286");
        Scanner cin = new Scanner(new BufferedInputStream(System.in));
        while(cin.hasNext()){
            BigDecimal num=cin.nextBigDecimal();
            System.out.println(pi.multiply((num.multiply(num))).toPlainString() +' '+pi.multiply(num.multiply(new BigDecimal("2"))).toPlainString());
        }


    }
}