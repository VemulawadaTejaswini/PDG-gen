import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
    BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
    String str=buf.readLine();
    String[] j=str.split(" ");
    
     int w=Integer.parseInt(j[0]);
     int h=Integer.parseInt(j[1]);
     int x=Integer.parseInt(j[2]);
     int y=Integer.parseInt(j[3]);
     int r=Integer.parseInt(j[4]);
     
     if(0<=(x-r) && (x+y)<=w && 0<=(y-r) && (y+x)<=h)
         System.out.println("Yes");
     else
         System.out.println("No");
    }
    
}