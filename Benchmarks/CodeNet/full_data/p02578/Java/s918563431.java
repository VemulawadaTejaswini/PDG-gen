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
        Long n = Long.valueOf(line);
        
        if (n == 1) {
            System.out.println("0");
            return;
        }
        
        line = null;
        while((line = stdin.readLine()) == null);
        var splited = line.split(" ");
        var a = Arrays.asList(line.split(" ")).stream().map(s -> Long.valueOf(s)).collect(Collectors.toList());
        
        Long result = 0L;
        for(Integer i = 0; i < n - 1;i++) {
            Long dai = Math.max(0, a.get(i) - a.get(i+1));
            result += dai;
            a.set(i + 1, a.get(i+1) + dai);
        }
        
        System.out.println(result);
    } catch(Exception e) {
    }
   
  }
}