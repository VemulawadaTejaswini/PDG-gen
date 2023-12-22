import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String t;
        while((t=buf.readLine())!=null){
            String str[]=t.split(" ");
            int x=Integer.parseInt(str[0]);
            int y=Integer.parseInt(str[1]);
         
                System.out.println((int)Math.log10(x+y)+1);
            }
        }
    }