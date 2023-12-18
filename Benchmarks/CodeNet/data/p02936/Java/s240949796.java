import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        
        int[] parent = new int[N];
        int[] point = new int[N];
        
        for(int i = 0; i < N - 1; i++){
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            parent[b] = a;
        }
        
        for(int i = 0; i < Q; i++){
            int a = sc.nextInt() - 1;
            int x = sc.nextInt();
            point[a] += x;
        }
        
        for(int i = 1; i < N; i++){
            point[i] += point[parent[i]];
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            sb.append(point[i]);
            if(i != N - 1 ) sb.append(" ");
        }
        
        System.out.println(sb.toString());
        
    }
}
