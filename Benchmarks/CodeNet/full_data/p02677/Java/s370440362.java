import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        FastReader in = new FastReader();
        test a=new test();
        a.solve(in,out);
        out.close();
    }
}

class test {
    public void solve(FastReader in, PrintWriter out) {
        int a=in.nextInt();
        int b=in.nextInt();
        double h =in.nextDouble();
        double m=in.nextDouble();
        //System.out.format("%.20f",Math.sqrt(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(Math.toRadians(cal(h,m)))));
        //System.out.println(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(Math.toRadians(cal(h,m))));
        double d =Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(Math.toRadians(cal(h,m)));
        //out.println(d);
        //out.println(squareRoot((int)d,20));
        out.println(BigDecimal.ONE.add(new BigDecimal(Math.sqrt(d))));

    }

    static int cal(double h, double m)
    {
        // validate the input
        if (h <0 || m < 0 || h >12 || m > 60)
            System.out.println("Wrong input");

        if (h == 12)
            h = 0;
        if (m == 60)
            m = 0;

        // Calculate the angles moved by hour and minute hands
        // with reference to 12:00
        int hour_angle = (int)(0.5 * (h*60 + m));
        int minute_angle = (int)(6*m);

        // Find the difference between two angles
        int angle = Math.abs(hour_angle - minute_angle);

        // smaller angle of two possible angles
        angle = Math.min(360-angle, angle);

        return angle;
    }

}


class FastReader{
    BufferedReader br;
    StringTokenizer st;

    public FastReader(){
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next(){
        while(st==null || !st.hasMoreElements()){
            try{
                st=new StringTokenizer(br.readLine());
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt(){
        return Integer.parseInt(next());
    }

    Long nextLong(){
        return Long.parseLong(next());
    }

    double nextDouble(){
        return Double.parseDouble(next());
    }
    String nextLine(){
        String str="";
        try{
            str=br.readLine();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return str;
    }
}