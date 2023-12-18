import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt(); //初項
        int f[]=new int[1000001];
        System.out.println(cal(s,f,0));
        
    }
    public static int cal(int s,int[]f,int count){
        f[s]++;
        count++;
        if(f[s]>=2) return count;
        if(s%2==0) s/=2;
        else s=s*3+1;
        return cal(s,f,count);
    }
}