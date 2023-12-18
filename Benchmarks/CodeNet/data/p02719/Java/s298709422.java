import java.util.*;
 
public class Main{
    public static  void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long N=0;
        long K=0;
        N=sc.nextLong();
        K=sc.nextLong();
        long T=0;
        T=N%K;
        long account=0;
        if(N<K){
            System.out.println(N);
        }else if(T>0){
            account=Math.abs(K-T);
            if(account>T)
            System.out.println(T);
            else if(account<T)
            System.out.println(account);
        }else if(T==0){
            System.out.println(0);
        }
    }
}