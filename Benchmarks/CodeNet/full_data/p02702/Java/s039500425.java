import java.io.*;
import java.util.*;

public class Main{
    static boolean[][] ary;

    static long count;
    static String s;

    static void dfs(int i){
        for(int j=0;j<4;j++){
            if(i<s.length() && ary[j][i]){
                count++;
                dfs(i+j+4);
            }
        }
    }

    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        ary=new boolean[4][s.length()];
        for(int i=0;i<s.length()-4;i++){
            for(int j=0;j<4;j++){
                if(i+4+j>s.length())continue;
                //System.out.print(s.substring(i,i+j+4) + " ");
                if((Integer.parseInt(s.substring(i,i+j+4))%2019==0)){
                    ary[j][i]=true;
                }
            }
            //System.out.println();
        }
        /*for(int i=0;i<4;i++){
            System.out.println(Arrays.toString(ary[i]));
        }*/
        for(int i=0;i<s.length();i++){
            dfs(i);
        }
        System.out.println(count);
    }
}