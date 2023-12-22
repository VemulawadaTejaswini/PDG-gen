import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
public class Main {
	public static final int TARO=0;
	public static final int HANAKO=1;
	public void exec() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] inStr= br.readLine().split(" ");
        double x1=Double.parseDouble(inStr[0]);
        double y1=Double.parseDouble(inStr[1]);
        double x2=Double.parseDouble(inStr[2]);
        double y2=Double.parseDouble(inStr[3]);
        double dx = x2 - x1;
        double dy = y2 - y1;
        out.printf("%.4f",Math.sqrt(dx*dx + dy*dy));
        out.flush();
    }
  
    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
}