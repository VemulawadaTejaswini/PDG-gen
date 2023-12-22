import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main{
  public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int second = Integer.parseInt(br.readLine());
		int h = second / (60 * 60);
                int m = second % (60 * 60) / 60;
                int s = second % (60 * 60) % 60;
                System.out.println(h + ":" + m + ":" + s);
	}
}