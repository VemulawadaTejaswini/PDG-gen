import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.stream.Collectors;

class Main {
  public static void main(String[] args) {
    try {
        var stdin = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        
        // 読み込み
        while((line = stdin.readLine()) == null);
        
        Long result = 0L;
        for(Integer i = 0; i < 10;i++) {
            String replaced = line.replace(i.toString(), "");
            result += (line.length() - replaced.length()) * i;
            line = replaced;
        }
        
        System.out.println(result % 9 == 0 ? "Yes": "No");
    } catch(Exception e) {
    }
   
  }
}