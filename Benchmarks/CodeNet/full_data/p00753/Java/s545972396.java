import java.util.Scanner;

/**
 * Created by Reopard on 2014/06/04.
 */
public class Main{
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        int n, count;
        int[] prime;
        while((n = sc.nextInt()) != 0){
            prime = new int[n];
            count = 0;
            outer:
            for(int i = 0; i < prime.length; i++){
                if(prime[i] == 1) continue;
                for(int j = 2; j < n + i; j++){
                    if(((n+1) + i) % j == 0){
                        prime[i] = 1;
                        for(int k = j; i+k < prime.length; k += j) prime[i+k] = 1;
                        continue outer;
                    }
                }
                count++;
            }
            System.out.println(count);
        }
    }
}