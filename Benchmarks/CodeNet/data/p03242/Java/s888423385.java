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
        String n = sc.next();

        for(int i=0; i<n.length(); i++){
            if(n.charAt(i) == '1') System.out.print('9');
            if(n.charAt(i) == '9') System.out.print('1');
        }
        System.out.println();
    }
}
