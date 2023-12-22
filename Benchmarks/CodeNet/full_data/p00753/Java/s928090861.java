
import java.util.Scanner;

/**
 * Created by Reopard on 2014/06/04.
 */
public class Main{
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        int n, count, tmp;
        //int[] prime;
        while((n = sc.nextInt()) != 0){
            //prime = new int[n];
            count = 0;
            outer:
            for(int i = 0; i < n; i++){
               if(/*prime[i] == 1 || */((n + 1) + i) % 2 == 0) continue;
                for(int j = 3; j < n + i; j += 2){
                    if(((n + 1) + i)%j == 0){
                        //for(int k = 0; i + k < prime.length; k += j) prime[i + k] = 1;
                        //tmp = j;
                        continue outer;
                    }
                }
                count++;
            }
            System.gc();
            System.out.println(count);
        }
    }
}