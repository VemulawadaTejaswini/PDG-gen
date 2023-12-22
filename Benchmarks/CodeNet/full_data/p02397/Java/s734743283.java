import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String s = br.readLine();
            String[] str = s.split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            if(x==0 && y==0) break;
            if(x>y){
                int i=0;
                i = x;
                x = y;
                y = i;
                System.out.println(x+" "+y);
            }else if(x<y){
                System.out.println(x+" "+y);
            }else if(x==y){
                System.out.println(x+" "+y);
            }
            
        }
    }
}