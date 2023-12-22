import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=br.readLine())!=null){
            String[] str = s.split(" ");
            int num = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
            System.out.println(str[0]+"\t"+str[1] + "\t"+num);
            int a = String.valueOf(num).length();
             System.out.println(a);
        }
    }
}