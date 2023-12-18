import java.io.FilterOutputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by wenzhong on 2016/8/6.
 */
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {//注意while处理多个case
            String s=in.next();
            boolean flag=true;
            for(int i=0;i<s.length()&&flag;i++){
                for(int j=i+3;j<s.length();j++){
                    String tmp=s.substring(i,j);
                    if(isBalanced(tmp)){
                        flag=false;
                        System.out.println(i+" "+(j-1));
                        break;
                    }
                }
            }
            if(flag)System.out.println("-1 -1");
        }
    }

    public static boolean isBalanced(String str){
        int[] a=new int[26];
        for(char c:str.toCharArray()){
            a[c-'a']++;
        }
        int max=-1;
        for(int ss:a){
            max=Math.max(max, ss);
        }
        if(max>str.length()/2)return true;
        return false;
    }
}
