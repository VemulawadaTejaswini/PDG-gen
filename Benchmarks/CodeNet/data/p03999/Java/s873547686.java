import java.io.*;
import java.util.*;
 class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char[] s = in.next().toCharArray();
        int n = s.length-1;
        long sum = 0;
        for(int i = 0; i < (1<<n);i++){
            sum+=add(s,i);
        }
        System.out.println(sum);
    }
    private static long add(char[] s,int bit){
        long res = 0;
        long tmp = 0;

        for(int i = 0;i < s.length;i++){
            tmp = 10*tmp + (s[i]-'0');
            if((bit&(1<<i))!=0){
                res += tmp;
                tmp = 0;
            }
        }
        res += tmp;

        return res;
    }
}