import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
  
public class Watch {
    public static void main(String[] args) throws IOException {
        int t = 0;
        int s = 0;
        int m = 0;
        int h = 0;
  
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
         t = Integer.parseInt(br.readLine());//数値
        //String buf = br.readLine();
  
        if (t >= 0 && t < 86400)
        {
            h = t / 3600;
            m = t % 3600 / 60;
            s = t - (3600 * h + m * 60);
            System.out.println(h+":"+m+":"+s);
        }
    }
}
