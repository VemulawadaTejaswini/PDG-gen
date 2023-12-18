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
        char[] A = sc.next().toCharArray();
        char[] B = sc.next().toCharArray();
        char[] C = sc.next().toCharArray();

        List<String> aArray = new ArrayList<>();
        List<String> bArray = new ArrayList<>();
        List<String> cArray = new ArrayList<>();

        for(char c: A){
            String s = String.valueOf(c);
            aArray.add(s);
        }
        for(char c: B){
            String s = String.valueOf(c);
            bArray.add(s);
        }
        for(char c: C){
            String s = String.valueOf(c);
            cArray.add(s);
        }

        String next = aArray.get(0);
        aArray.remove(0);

        String ans = "";

        while(true){
            if(next.equals("a")){
                if(aArray.size() == 0){
                    ans = "A";
                    break;
                }
                next = aArray.get(0);
                aArray.remove(0);
            } else if(next.equals("b")){
                if(bArray.size() == 0){
                    ans = "B";
                    break;
                }
                next = bArray.get(0);
                bArray.remove(0);
            } else {
                if(cArray.size() == 0){
                    ans = "C";
                    break;
                }
                next = cArray.get(0);
                cArray.remove(0);
            }
        }

        System.out.println(ans);
    }
}
