
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt(), M = sc.nextInt();
        int[][] route = new int [M][2];
        for(int i=0;i<M;i++){
            route[i][0] = sc.nextInt()-1;   //最後に1を足せ
            route[i][1] = sc.nextInt()-1;
        }
        int[] ans = new int[N];
        for(int i=0;i<N;i++){
            ans[i] = -1;
        }
        ans[0] = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        while(queue.size() != 0){
            int iter = queue.poll();
            for(int i=0;i<M;i++){
                if(route[i][0] == iter && ans[route[i][1]] == -1){
                    ans[route[i][1]] = iter;
                    queue.add(route[i][1]);
                }
                if(route[i][1] == iter && ans[route[i][0]] == -1){
                    ans[route[i][0]] = iter;
                    queue.add(route[i][0]);
                }
            }
        }
        boolean flag = false;
        for(int i=0;i<N;i++){
            if(ans[i] == -1){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("No");
        }else{
            for(int i=0;i<N;i++) {
                System.out.println(i == 0 ? "Yes" : ans[i]+1);
            }
        }
    }
}
