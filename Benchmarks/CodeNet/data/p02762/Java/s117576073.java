import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int[] roots = new int[N];
        int[] cnts = new int[N];
        int[] jisu = new int[N];
        int[] ans = new int[N];
        for(int i=0;i<N;i++){
            roots[i]=i;
            cnts[i] = 0;
            jisu[i]=0;
        }

        for(int i=0;i<M;i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            jisu[a]++;
            jisu[b]++;
            my_union(roots, a, b);
        }
        for(int i=0;i<N;i++){
            int root = my_find(roots, i);
            cnts[root]++;
        }
        for(int i=0;i<N;i++){
            int root = my_find(roots, i);
            ans[i] = cnts[root]-1;
            ans[i] -= jisu[i];
        }
        for(int i=0;i<K;i++){
            int c = sc.nextInt()-1;
            int d = sc.nextInt()-1;
            if(my_find(roots, c) == my_find(roots, d)){
                ans[c]--;
                ans[d]--;
            }
        }
        for(int p:ans){
            System.out.print(p + " ");
        }
    }

    private static void printarr(int[] a){
        for(int p:a){
            System.out.print(p);
        }
        System.out.println();
    }

    private static int my_find(int[] roots, int i){
        List<Integer> ch = new ArrayList<>();
        while(roots[i] != i){
            ch.add(i);
            i = roots[i];
        }
        for(Integer c:ch){
            roots[c] = i;
        }
        return i;
    }

    private static void my_union(int[] roots, int a, int b){
        int ra = my_find(roots, a);
        int rb = my_find(roots, b);
        roots[ra] = rb;
        return;
    }

}
