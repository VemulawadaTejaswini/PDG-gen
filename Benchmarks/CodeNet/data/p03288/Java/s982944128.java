import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    //グローバル変数を定義

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = "";

        if(a < 1200){
            s = "ABC";
        } else if(a < 2800){
            s = "ARC";
        } else {
            s = "AGC";
        }

        System.out.println(s);
    }
}
