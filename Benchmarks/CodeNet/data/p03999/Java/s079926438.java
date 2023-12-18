import java.io.*;
import java.util.*;
 class Scratch{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char[] s = in.next().toCharArray();
        int n = s.length-1;
        long sum = 0;
        for(int i = 0; i <(1<<n);i++){
            int num = i;
            int k =1;
            int start = 0;
            while(num>0){
                int j = num%2;
                if(j==1){
                    sum+=toInt(s,start,k);
                    start = k;
                    k++;
                }
                else{
                    k++;
                }
                num/=2;
            }
            sum+=toInt(s,start,s.length);
        }
        System.out.println(sum);
    }
    public static long toInt(char[] s,int lo,int hi){
        long num =0;
        for(int i = lo; i < hi ; i++){
            num	= num*10+s[i]-'0';
        }
        return num;
    }
}