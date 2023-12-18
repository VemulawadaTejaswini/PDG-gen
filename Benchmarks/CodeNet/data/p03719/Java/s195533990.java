import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

     // 標準入力を1行ずつ読み出す。
     String line;
     while ((line = stdin.readLine()) != null) {
         String[] lines = line.split(" ");
         if(Integer.parseInt(lines[0]) <= Integer.parseInt(lines[2]) &&
                 Integer.parseInt(lines[2]) <= Integer.parseInt(lines[1])){
                 System.out.println("YES");
         }
         else {
             System.out.println("NO");
             }
     }
    }
}
