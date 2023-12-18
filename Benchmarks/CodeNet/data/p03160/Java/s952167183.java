import java.util.Scanner;
import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int N = Integer.parseInt(scanner.nextLine());
                int[] costs = new int[N];
                int[] cache = new int[N];
                String[] c = scanner.nextLine().split(" ");
                for(int i = 0 ; i < N ; i++) {
                        costs[i] = Integer.parseInt(c[i]);
                        cache[i] = 1000000;
                }
                cache[0] = 0;
                System.out.println(jump(costs, 2, cache));
                return;
        }

        private static int jump(int[] costs, int k, int[] cache) {
                for(int i = 0 ; i < costs.length-1 ; i++) {
                        // now check the min cost to reach in this cell
                        // from last k cells. 
                        for(int j = 1 ; j <= k ; j++) {
                                //ith cell of cache will have min of i-jth cell + its cost from coming there.
                                // if it has already lower value, lets keep that as is.
                                if(i+j < costs.length)
                                        cache[i+j] = Math.min(cache[i+j], cache[i]+Math.abs(costs[i] - costs[i+j]));
                        }
                        //System.out.println(Arrays.toString(cache));
                }
                return cache[costs.length-1];
        }
}
