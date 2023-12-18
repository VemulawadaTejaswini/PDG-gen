import java.util.*;
import java.io.*;
import java.math.BigDecimal;

class Main{
    public static void main(String args[])throws IOException{
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            double input = Double.parseDouble(br.readLine());

            BigDecimal num = new BigDecimal(input);
            BigDecimal three = new BigDecimal(3);
            BigDecimal x = num.divide(three);
            BigDecimal answer = x.multiply(x).multiply(x);

            double result = answer.doubleValue();

            System.out.println(result);
        }
   
    }
}