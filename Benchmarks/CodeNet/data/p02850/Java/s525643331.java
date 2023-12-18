import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrList[] edges = new ArrList[n];
        for (int i = 0; i < n; i++) {
            edges[i] = new ArrList();
        }
        for (int i = 0; i < n-1; i++) {
            int a = in.nextInt()-1;
            int b = in.nextInt()-1;
            edges[a].add(b);
            edges[b].add(a);
        }
        int k = 0;
        for (ArrList a : edges)
            k = Math.max(k,a.size());
        for (ArrList a : edges)
            a.c = new boolean[k];
        System.out.println(k);
        for (int i = 0; i < n; i++){
            for (int j = edges[i].size()-1; j >= 0 ; j--){
                int m = edges[i].remove(j);
                edges[m].remove((Integer) i);
                for (int x = 0; x < k; x++){
                    if (!edges[i].c[x]){
                        edges[i].c[x] = true;
                        edges[m].c[x] = true;
                        System.out.println(x+1);
                        break;
                    }
                }
            }
        }
    }

    public static class ArrList extends ArrayList<Integer>{
        boolean[] c;
    }
}