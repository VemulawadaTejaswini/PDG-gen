import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{

        InputStreamReader isr =new InputStreamReader(System.in);
   		BufferedReader br =new BufferedReader(isr);
    	String buf = br.readLine();
        
        while (true) {
            int i, sum = 0;
            if (buf.charAt(0) - '0' == 0) break;
            for (i = 0;i < buf.length();i++) {
                sum += buf.charAt(i)-'0';
            }
            System.out.println(sum);
            buf = br.readLine();
        }
    }
}