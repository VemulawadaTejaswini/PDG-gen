import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        long N = sc.nextLong();
        long ans = 0;
        for(long i=1;i<=N;i++){
        if(((i%3)!=0)||((i%5)!=0))
        ans= ans+i;
        }
        System.out.println(ans);
    }
}