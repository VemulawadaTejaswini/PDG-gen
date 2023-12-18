import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        int a, b, p, x;
        
        HashMap<Integer, ArrayList> map = new HashMap<>();
        for(int i = 0; i < n-1; i++){
            a = Integer.parseInt(sc.next());
            b = Integer.parseInt(sc.next());
            
            if(!map.containsKey(a)){
                ArrayList<Integer> list = new ArrayList<>();
                map.put(a, list);
            }
            map.get(a).add(b);
            
            if(!map.containsKey(b)){
                ArrayList<Integer> list = new ArrayList<>();
                map.put(b, list);
            }
            map.get(b).add(a);
        }
        
        int[] count = new int[n];
        for(int i = 0; i < q; i++){
            p = Integer.parseInt(sc.next());
            x = Integer.parseInt(sc.next());
            count[p-1] += x;
        }
        
        ArrayDeque<Integer> que = new ArrayDeque();
        que.offer(1);
        boolean[] visited = new boolean[n];
        
        while(!que.isEmpty()){
            int i = que.poll();
            ArrayList<Integer> list = map.get(i);
            visited[i-1] = true;
            
            list.forEach((v) -> {
                if(!visited[v-1]){
                    count[v-1] += count[i-1];
                    que.offer(v);
                }
            });
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(count[i]).append(" ");
        }
        System.out.println(sb);
    }
}