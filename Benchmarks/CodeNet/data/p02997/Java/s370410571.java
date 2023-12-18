import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int max = (N -1) * (N - 2) / 2;
        
        if ( max < K ) {
            System.out.println(-1);
            return;
        }
        
        Node[] nodes = new Node[N];
        for(int i = 0; i < N; i++){
            nodes[i] = new Node(i);
            
            if (i > 0){
                nodes[0].adjacents.add(nodes[i]);
                nodes[i].adjacents.add(nodes[0]);
            }
        }
        
        int countGoal = max - K;
        int count = 0;

        loop1: for(int i = 1; i < N - 1; i++){
            for(int j = i + 1; j < N; j++){
                if ( count++ == countGoal ) break loop1;
                nodes[i].adjacents.add(nodes[j]);
                nodes[j].adjacents.add(nodes[i]);
            }
        }
        
        int M = 0;
        
        loop2: for(int i = 0; i < N - 1; i++){
            for(int j = i + 1; j < N; j++){
                if ( nodes[i].adjacents.contains(nodes[j]) ){
                    M++;
                } else {
                    break loop2;
                }
            }
        }
        
        System.out.println(M);
        
        loop3: for(int i = 0; i < N - 1; i++){
            for(int j = i + 1; j < N; j++){
                if ( nodes[i].adjacents.contains(nodes[j]) ){
                    System.out.println( (i + 1) + " " + (j + 1) );
                } else {
                    break loop3;
                }
            }
        }
        
    }
    
    static class Node{
        int id;
        
        public Node(int id){
            this.id = id;
        }
        
        List<Node> adjacents = new LinkedList<>();
    }
}
