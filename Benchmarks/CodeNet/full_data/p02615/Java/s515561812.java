import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);

        for(int i = 0; i < n; i++){
            q.add(sc.nextInt());
        }

        int before = 0;
        int ans = 0;

        while(!q.isEmpty()){
            ans += before;
            int a = q.poll();
            before = a;
        }

        System.out.println(ans);

    }
}
