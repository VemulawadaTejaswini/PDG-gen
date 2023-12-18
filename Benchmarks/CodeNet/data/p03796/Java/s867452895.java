import java.util.*;
class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        /*try {
            while(true){*/
                int N = sc.nextInt();
                System.out.println(fact(N));
            /*}
        //}catch(InputMismatchException e){}*/
    }

    /*public static long fact(long N){
        if(N==1) return 1;
        else {
            long r = (N * fact(N-1)) % ((long)Math.pow(10,9)+7);
            return r ;
        }
    }*/
    public static long fact(int N){
        long res = 1;
        for(int i = 1; i<=N; i++){
            res = (res * i) % ((int)Math.pow(10, 9) + 7);
        }
        return res;
    }
}