import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
 
public class Main {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader(System.in);
        StringBuilder sb = new StringBuilder();
        DecimalFormat df=new DecimalFormat("0.0000");
        double r=in.nextInt();
        double ans=2*r*Math.PI;
        System.out.println(df.format(ans));
    }
}