import java.io.*;
import java.util.*;

//height 違う
public class Main{
    static int count =0;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        str = br.readLine();
        
        String[] tmp = str.split("\\s");
        int[] num = new int[2];
        num[0] = Integer.parseInt(tmp[0]);
        num[1] = Integer.parseInt(tmp[1]);
        run(num[0],num[1]);

    }
    public static void run(int a,int b){
        if(a<b){
            System.out.println("a < b");
        }else if(a > b){
            System.out.println("a > b");
        }else{
            System.out.println("a == b");
        }
    }
}
