import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1=0,num2=0;
        String s=br.readLine();
        String[] str = s.split(" ");
        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);
        if(x<y){
            System.out.println("a"+ " < "+"b");
        }else if(x>y){
            System.out.println("a"+ " > "+"b");
        }else if(x==y){
            System.out.println("a"+ " == "+"b");
        }
        
    }
}