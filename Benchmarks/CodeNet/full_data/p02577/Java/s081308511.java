//package Div2_655;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char c[]=br.readLine().toCharArray();
        int rem=0;
        for(int i=0;i<c.length;i++){
            int x=c[i]-48;
            rem+=x;
            if(rem>9){
                rem-=9;
            }
        }
        if(rem==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
