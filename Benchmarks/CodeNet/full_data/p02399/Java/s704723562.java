import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String str=buf.readLine();
        String[] ra=str.split(" ");
        
        int x=Integer.parseInt(ra[0]);
        int y=Integer.parseInt(ra[1]);
        int d,r;
        
        d=x/y;
        y=x%y;
        double f=(double)x/(double)y;
        System.out.print(d+" "+y+" "+f);
    }
}