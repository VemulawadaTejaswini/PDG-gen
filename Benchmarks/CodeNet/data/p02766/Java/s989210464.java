import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        long i=1;

        while(N >= pow(K, i)){
            i++;
        }
        System.out.println(i);
    }

    private static long pow(long n, long k){
        if(k==0){return 1;}
        if(k == 1){return n;}
        else{
            return pow(n, k-1)*n;
        }
    }
}
