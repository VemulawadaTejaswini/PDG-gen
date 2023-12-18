import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        
        String az = "[*A*-*Z*]";
        
        if(line == az){
            //文字数を取得
        int ka1 = line.length();
        //文字数を表示
        System.out.println(ka1);
        }
    }
}
