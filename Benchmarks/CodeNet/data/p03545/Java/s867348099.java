import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    //グローバル変数を定義
    List<char[]> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        char[] array = sc.next().toCharArray();
        int[] intArray = new int[array.length];
        for(int i=0; i<array.length; i++){
            intArray[i] = Character.getNumericValue(array[i]);
        }

        // nは個数で、Math.pow(2,n)は、32個の
        // 組み合わせができることを指している。
        for(int bit=0; bit<Math.pow(2, array.length-1); bit++){
//            StringBuilder str = new StringBuilder();
            String str = "";
            for(int i=0; i<array.length; i++){
                //bitにi番目のフラグが立っているかどうか
                if((1&bit>>i) == 1){
                    str += intArray[i] + "+";
//                    str.append(intArray[i] + "+");
                } else if(i==array.length-1){
                    str += intArray[i] + "=7";
                } else {
                    str += intArray[i] + "-";
                }
            }
            int sum = 0;
            char op = '*';
            sum += Character.getNumericValue(str.charAt(0));
            for(int j=1; j<str.length()-1; j++){
                char cBefore = str.charAt(j-1);
                char cNow = str.charAt(j);
                if(cBefore == '+'){
                    sum+=Character.getNumericValue(cNow);
                } else if(cBefore == '-'){
                    sum-= Character.getNumericValue(cNow);
                } else if(cBefore == '='){
                    break;
                }
            }

            if(sum == 7){
                System.out.println(str);
                break;
            }
        }
    }
}
