
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String argps[]) throws IOException{
        process();
    }
    public static void process() throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(in.readLine());
        double a=Double.parseDouble(st.nextToken());
        double b=Double.parseDouble(st.nextToken());
      	a*=b;
        long res=(long)(a);
        System.out.println(res);
    }
}
