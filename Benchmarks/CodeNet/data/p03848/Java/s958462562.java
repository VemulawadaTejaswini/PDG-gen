import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long mod = (long)Math.pow(10,9)+7;
        int n = sc.nextInt();
        long nl = (long)n;
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[sc.nextInt()]++;
        }
        if(n == 1 && a[0] == 1){
            System.out.println(1);
        }else if(n % 2 == 0){
            for(int i = 1; i < n; i+=2){
                if(a[i] != 2){
                    System.out.println(0);
                    return;
                }
            }
            System.out.println(nl/2L * nl/2L % mod);
        }else{
            for(int i = 0; i < n; i+=2){
                if((i == 0 && a[i] != 1) || (i != 0 && a[i] != 2)){
                    System.out.println(0);
                    return;
                }
            }
            System.out.println((nl-1L)/2L * (nl-1L)/2L % mod);
        }
    }
}
