import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int q = stdIn.nextInt();

        int[] uf = new int[n];

        init_uf(uf);

        int p, a, b;
        for(int i=0; i<q; i++){
            p = stdIn.nextInt();
            a = stdIn.nextInt();
            b = stdIn.nextInt();

            if(p == 0){
                if(search_root(a, uf) != search_root(b, uf)){
                    union_group(a, b, uf);
                }
            }else{
                if(search_root(a, uf) == search_root(b, uf)){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }
        }
    }

    static void init_uf(int[] uf){
        for(int i=0; i<uf.length; i++){
            uf[i] = i;
        }
    }

    static int search_root(int f, int[] uf){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int idx = f;
        while(idx != uf[idx]){
            list.add(idx);
            idx = uf[idx];
        }
        // ツリー圧縮
        while(!list.isEmpty()){
            int item = list.remove(0);
            uf[item] = idx;
        }
        return idx;
    }

    static void union_group(int f1, int f2, int[] uf){
        int root1 = search_root(f1, uf);
        int root2 = search_root(f2, uf);
        uf[root2] = root1;
    }
}
