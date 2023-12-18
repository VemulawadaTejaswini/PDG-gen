import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String[] ss=br.readLine().split(" ");
            long A=Long.parseLong(ss[0]);
            long B=Long.parseLong(ss[1]);
            long N=Long.parseLong(ss[2]);
            long ans=0;
            if(B==1){
                System.out.println(0);
                return;
            }
            if(B>N){
                ans=(A*N)/B;
            }else{
                long p=B-1;
                while(p<=N){
                    ans=Math.max(ans,(A*p)/B-A*(p/B));
                    p+=B;
                }
            }
            System.out.println(ans);
        }catch(Exception e){
            System.out.println("KKKK "+e.getMessage());
        }
    }
    static int mod(int a,int b){
        if (a>b){
            return a-b;
        }
        return b-a;
    }
    static void shuffle(int[] a) {
        Random get = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = get.nextInt(a.length);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }
}
