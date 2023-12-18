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
        Map<String, Integer> map = new HashMap<>();

        boolean check = true;

        for(char c: input){
            String s = String.valueOf(c);
            if(map.keySet().contains(s)){
                map.put(s, map.get(s)+1);
            } else {
                map.put(s, 1);
            }
        }

        for(int i: map.values()){
            if(i % 2 != 0){
                check = false;
                break;
            }
        }

        if(check) System.out.println("Yes");
        else System.out.println("No");
    }
}
