import java.io.*;
import java.util.*;
 
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader re =
         new BufferedReader(new InputStreamReader(System.in));       
        String line = re.readLine();       
         
        int cnt=0;
 
        String st[] = line.split(" ",0);
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);
       
        
        int r= a / b;
        int d = a % b;
        Double f = 1.0*a / b;
        System.out.println(r + " " + d + " " + f); 
        re.close();
    }
}