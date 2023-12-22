import java.util.*;
import java.io.*;
 
class Main{
    public static void main(String args[])throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String s;
       int sum=0;
       while((s = br.readLine())!=null){
           int x = Integer.parseInt(s);
           if(x==0 && x<1000) break;
           do{
               sum += x%10;
           }while((x/=10)!=0);
           System.out.println(sum);
           sum=0;
       }
    }
}