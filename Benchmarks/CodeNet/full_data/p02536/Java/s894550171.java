//import com.company.formwork.DSU;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        DSU dsu = new DSU(n);
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            dsu.union(a-1,b-1);
        }

        System.out.println(dsu.unlink()-1);
    }
    //并查集
}


class DSU {
    private int[] parents;

    public DSU(int n){
        //初始化
        parents = new int[n];
        for (int i = 0; i < n; i++) {
            parents[i]=i; }
    }

    public int find(int p){
        while (parents[p]!=p){
            p=parents[p];
        }
        return p;
    }

    public void union(int p,int q){
        int parent1 = find(p);
        int parent2 = find(q);
        if (parent1!=parent2){
            parents[parent1] = parent2;
        }
    }

    //多少个联通集
    public int unlink(){
        int res = 0;
        for (int i = 0; i < parents.length; i++) {
            if (parents[i] == i){
                res++;
            }
        }
        return res;
    }

    public int change(){
        int res = 0;
        for (int i = 0; i < parents.length; i++) {
            if (parents[i]!=0){
                res++;
            }
        }
        return res;
    }

}