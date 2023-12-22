import java.util.*;
import java.io.*;
 
class Main{
    public static void main(String args[])throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String s;
       char c;
       while((s = br.readLine())!=null){
           if(s.length()>=1200)break;
           for(int i=0; i<s.length(); i++){
                   c = s.charAt(i);
                   if(c>=0x41 && c<=0x5a){
                       c += 0x20;
                   }else if(c>=0x61 && c<=0x7a){
                       c -= 0x20;
                   }
                   System.out.print(c);
           }
       }
        System.out.println("");
    }
}