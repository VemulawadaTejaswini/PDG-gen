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
        char[] input = sc.next().toCharArray();
        StringBuilder str = new StringBuilder();

        for(char c: input){
            if(c == '0'){
                str.append("0");
            } else if(c == '1'){
                str.append("1");
            } else {
                if(str.length() > 0){
                    str.deleteCharAt(str.length()-1);
                }
            }
        }

        System.out.println(str.toString());
    }
}
