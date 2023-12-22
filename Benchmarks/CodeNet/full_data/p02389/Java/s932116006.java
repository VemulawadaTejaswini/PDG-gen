import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        String s;
        int num1=0,num2=0;
        while((s=br.readLine())!=null){
            String[] str = s.split(" ");
            num1 = Integer.parseInt(str[0]) * Integer.parseInt(str[1]);
            num2 = (Integer.parseInt(str[0]) + Integer.parseInt(str[1]))*2;
        }
        System.out.println(num1 +" "+num2);
    }
}