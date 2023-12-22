import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

class Main{
    private static final Scanner sc = new Scanner(System.in);
    private static final DecimalFormat fmt = new DecimalFormat("0.########");
    private static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] Args) throws IOException{
        while(true){
            final int n = Integer.parseInt(sc.next());
            if(n==0) break;
            final int s[] = new int[n];
            for(int i = 0; i<s.length; i++){
                s[i] = Integer.parseInt(sc.next());
            }
            double m = 0;
            for(final int e:s)
                m += e;
            m /= n;
            double a = 0;
            for(final int e:s)
                a += (e-m)* (e-m);

            out.println(fmt.format(Math.sqrt(a/n)));
        }
        out.flush();
    }
}