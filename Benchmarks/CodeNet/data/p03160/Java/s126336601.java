import java.util.Scanner;
import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int N = scan.nextInt();
                int[] costs = new int[N];
                int[] cache = new int[N];
                for(int i = 0 ; i < N ; i++) {
                        costs[i] = scan.nextInt();
                        cache[i] = 2147483647;
                }
                cache[0] = 0;
                cache[1] = Math.abs(costs[1]-costs[0]);
                System.out.println(jump(costs, 2, cache));
                return;
        }

        private static int jump(int[] costs, int k, int[] cache) {
                for(int i = 2 ; i < costs.length ; i++) {
                    //for(int j = i-1 ; j >= i-k ; j--){
                        //cache[i] = Math.min(cache[i], cache[j]+(Math.abs(costs[i] - costs[j])));
                    //}
                    cache[i] = Math.min(cache[i-1]+Math.abs(costs[i-1]-costs[i]), cache[i-2]+Math.abs(costs[i-2]-costs[i]));
                }
                return cache[costs.length-1];
        }
}