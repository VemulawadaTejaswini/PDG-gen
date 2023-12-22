import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
public class Main {
    public void exec() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        while(true) {
            String line = br.readLine();
            if ("-".equals(line))
            	break;
            int len = line.length();
            int m = Integer.parseInt(br.readLine());
            int h = 0;
            for (int i=0; i<m; i++) {
            	h += Integer.parseInt(br.readLine());
            }
            h %= len;
            if(h == 0)
            	out.println(line);
            else {
            	out.print(line.substring(h, len));
            	out.println(line.substring(0, h));
            }
            out.flush();
        }
    }
  
    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
}