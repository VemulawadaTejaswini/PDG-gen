import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.BiConsumer;

public class Main {

    //グローバル変数を定義

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String last = sc.next();
        boolean isInRule = true;
        ArrayList<String> already = new ArrayList<>();
        already.add(last);

        for(int i=1; i<n; i++){
            String input = sc.next();
            if(last.charAt(last.length()-1) != input.charAt(0)){
                isInRule = false;
                break;
            }
            if(already.contains(input)){
                isInRule = false;
            }
            already.add(input);
            last = input;
        }

        if(isInRule){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
