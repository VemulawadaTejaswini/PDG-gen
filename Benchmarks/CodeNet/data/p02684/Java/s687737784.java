import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayDeque;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        long K = sc.nextLong();
        int[] A = new int[N + 1];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        stack.add(1);

        for(int i=1; i<=N; i++){
            A[i] = sc.nextInt();
        }
        boolean[] memo = new boolean[N + 1];
        int[] d = new int[N + 1];
        int y = 0;;
        int x = 0;
        for(int i=1; i<=N+1; i++){
            x = stack.pop();
            if(memo[x]){
                y = i - d[x];
                x = d[x] - 1;
                break;
            }
            else{
                memo[x] = true;
                d[x] = i;
            }
            stack.add(A[x]);
            list.add(A[x]);
        }
        int z = (int)(K - x) % y;
        System.out.println(list.get(z + x));
    }
}