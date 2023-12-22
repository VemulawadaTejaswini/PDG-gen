import java.util.*;
import java.io.*;
import java.lang.*;
public class q1{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char ch[] = str.toCharArray();
        int r = 0;
        int max = 0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='R'){
                r++;
            }
            else{
                max = Math.max(max,r);
                r=0;
            }
        }
        System.out.println(max);
    }
}