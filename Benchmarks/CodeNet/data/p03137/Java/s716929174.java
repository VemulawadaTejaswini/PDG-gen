import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n >= m){
            System.out.println(0);
            return;
        }
        int[] al = new int[200001];
        int min = Integer.MAX_VALUE;
        int max = -Integer.MAX_VALUE;
        for(int i = 0; i < m; i++){
            int j = sc.nextInt()+100000;
            al[j] += 1;
            min = Math.min(min,j);
            max = Math.max(max,j);
        }
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int cnt = 0;
        for(int i = min; i <= max; i++){
            if(al[i] == 0){
                cnt++;
            }else{
                if(cnt != 0){
                    q.add(cnt);
                    cnt = 0;
                }
            }
        }
        int ans = max-min-n;
        while(n - 1 > 0 && q.size() > 0){
            ans -= q.poll();
            n--;
        }
        System.out.println(ans+1);
    }
    
}