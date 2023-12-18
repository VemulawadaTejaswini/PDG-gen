

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static int[][] memo;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 1; i <= n; i++){
            set.add(scanner.nextInt());
        }
        memo = new int[3][k+1];
        memo[1][0] = 2;
        memo[2][0] = 1;
        int res = play(set, k, 1, 2);
        if(res==1){
            System.out.println("First");
        }else{
            System.out.println("Second");
        }
    }

    public static int play(Set<Integer> set, int k, int first, int second){
        if(memo[first][k]!=0) return memo[first][k];
        for(Integer i : set){
            if(k-i>=0) {
                int aux = play(set, k - i, second, first);
                if (aux == first) {
                    memo[first][k] = first;
                    break;
                }
            }
        }
        if(memo[first][k]!=first) memo[first][k] = second;
        return memo[first][k];
    }
}
