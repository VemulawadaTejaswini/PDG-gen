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

        long sum = 0;
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
                } else {
                    str += intArray[i];
//                    str.append(intArray[i]);
                }
            }
//            System.out.println(str);
            String[] res = str.split("[+]");
            for(String s: res){
//                System.out.println(s);
                long val = Long.parseLong(s);
                sum+=val;
            }
        }
        System.out.println(sum);
    }
}
