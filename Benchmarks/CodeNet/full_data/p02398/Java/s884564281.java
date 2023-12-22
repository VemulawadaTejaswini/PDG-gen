import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader r =
         new BufferedReader(new InputStreamReader(System.in));       
        String line = r.readLine();       
        
        int cnt=0;

        String st[] = line.split(" ",0);
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);
        int c = Integer.parseInt(st[2]);

        for(int i = a ; i <=b ; i++){
            if (c % i == 0) cnt++;
        }
        System.out.println(cnt);         
    }
}