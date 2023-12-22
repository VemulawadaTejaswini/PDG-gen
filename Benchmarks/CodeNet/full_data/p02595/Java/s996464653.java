import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
class Main {
  public static void main(String[] args) {
    try {
        var stdin = new BufferedReader(new InputStreamReader(System.in));
        String line;
        Integer n=null;
        Integer d=null;
        Integer currentLine=0;
        Integer count=0;
        while ((line = stdin.readLine()) != null && currentLine!=n) {
            if (n==null) {
                var splited = line.split(" ");
                n = Integer.valueOf(splited[0]);
                d = Integer.valueOf(splited[1]);
            } else {
                currentLine++;
                var splited = line.split(" ");
                Integer x = Integer.valueOf(splited[0]);
                Integer y = Integer.valueOf(splited[1]);
                if (x*x+y*y<=d*d) {
                    count++;
                }
            }

        }
        System.out.println(count);
    } catch(Exception e) {
    }
   
  }
}