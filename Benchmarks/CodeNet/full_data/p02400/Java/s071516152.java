import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String str=buf.readLine();
        double x=Double.parseDouble(str);
    
        String f=String.format("%.6f",(double)x*(double)x*3.1415926);
        String t=String.format("%.6f",(double)x*2*3.1415926);
        System.out.println(f+" "+t);
    }
}