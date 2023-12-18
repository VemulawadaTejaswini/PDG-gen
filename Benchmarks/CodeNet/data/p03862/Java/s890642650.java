import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long x = sc.nextLong();
        long ans = 0;
        long A1 = sc.nextLong();
        if (A1 >= x){
          ans += A1-x;
          A1 -= ans;
        }
            
        for (long i=2;i<=N;i++){
        long nextA = sc.nextLong();
        if ((A1+nextA)>x){
          ans += A1+nextA-x;
          A1 = Math.max(0,x-A1);
        }
        }   
          
       System.out.println(ans);
    }
}