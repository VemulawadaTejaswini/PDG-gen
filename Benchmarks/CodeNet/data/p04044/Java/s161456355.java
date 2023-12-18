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
        int N = sc.nextInt();
        int L = sc.nextInt();
        List<String> list = new ArrayList();

        for(int i=0; i<N; i++){
            String s = sc.next();
            list.add(s);
        }

        Collections.sort(list);

        String str = "";

        for(String s: list){
            str += s;
        }
        System.out.println(str);
    }
}
