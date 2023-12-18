import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] value = new int[n];
        List<Integer>[] edge = new ArrayList[n];

        for (int i=0; i<n; i++){
            edge[i] = new ArrayList<>();
        }

        for (int i=0; i<n-1; i++){
            int v = sc.nextInt()-1;
            int u = sc.nextInt()-1;
            edge[v].add(u);
        }

        for (int i=0; i<q; i++){
            int s = sc.nextInt()-1;
            int v = sc.nextInt();
            value[s] += v;
        }

//        List<Integer> l = new ArrayList<>();
        Queue<Integer> l = new ArrayDeque<>();

        l.add(0);

        while (!l.isEmpty()){
            int a = ((ArrayDeque<Integer>) l).pollFirst();
            for (int c: edge[a]){
                value[c] += value[a];
                l.add(c);
            }
        }

        for (int i=0; i<n; i++){
            System.out.print(value[i]+" ");
        }

    }

}
