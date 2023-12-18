import java.util.Scanner;

public class Main{

    public static long gcm(long b,long r){
        long _r;
        if(b<r) return gcm(r,b);
        _r=b%r;
        if(_r==0)return r;
        else return gcm(r,_r);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] T = new long[n];
        for(int i=0;i<n;i++){
          T[i]=scan.nextLong();
        }
        for(int i=0;i<n-1;i++){
          T[i+1]=T[i]*T[i+1]/gcm(T[i+1],T[i]);
        }
        System.out.println(T[n-1]);
    }
}
