import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        Map<Integer, List<Integer>> adja = new HashMap<>();
        Set<Integer> tree = new HashSet<>();
        for(int i=1; i<=N; i++){
            adja.put(i, new ArrayList<>());
            tree.add(i);
        }
        for(int i=0; i<N-1; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            adja.get(a).add(b);
            tree.remove(b);
        }
        int root = (int)tree.toArray()[0];
        Map<Integer, Integer> oper = new HashMap<>();
        for(Integer node:adja.keySet()){
            oper.put(node, 0);
        }
        for(int i=0; i<Q; i++){
            int p = scanner.nextInt();
            int x = scanner.nextInt();
            oper.put(p, oper.get(p) + x);
        }

        LinkedList<Integer> nodes = new LinkedList<>();
        nodes.add(root);
        while(nodes.size()>0){
            int node = nodes.poll();
            for(Integer nextnode: adja.get(node)){
                oper.put(nextnode, oper.get(nextnode) + oper.get(node));
                nodes.add(nextnode);
            }            
        }

        for(int i=1; i<=N; i++){
            System.out.println(oper.get(i));
        }
    }
}