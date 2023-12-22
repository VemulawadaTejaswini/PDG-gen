import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] str = s.split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        
        if(!(a<1) || (b>Math.pow(10,9))){
            System.out.println(a/b);
            System.out.println(a%b);
            System.out.println((double)a/b);
        }
    }
}