import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();


        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> a - b);

        for(int i = 0; i < n; i++){
            q.add(sc.nextInt());
        }

        int ans = 0;

        for(int i = 0; i < k; i++){
            ans += q.poll();
        }

        System.out.println(ans);

    }
}
