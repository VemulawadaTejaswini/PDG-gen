import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final long MOD = 1000000007;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long count = 1;
        boolean[] sieve = new boolean[1001];
        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false;
        int index = 2;
        while(index * index <= 1000){
            if(sieve[index]){
                for (int i = index * index; i <= 1000 ; i += index) {
                    sieve[i] = false;
                }
            }
            index += 1;
        }
        ArrayList<Integer> prime = new ArrayList<>();
        for(int i = 2; i <= 1000; i++)
            if(sieve[i])  prime.add(i);
         index = 0;
         while(index < prime.size()){
             int curr = prime.get(index);
             int exp = curr;
             if(curr > n)
                 break;
             int factor = 0;
             while(exp <= n){
                 factor += n / exp;
                 exp *= curr;
             }
             count = (count * (factor + 1)) % MOD;
             index += 1;
         }
        System.out.println(count);
    }
}
