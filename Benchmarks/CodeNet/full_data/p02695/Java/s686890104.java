import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static final int ALF = 26;
    int ans = 0;

    Main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        ArrayList<Order> orders = new ArrayList<Order>(Q);
        for (int i = 0; i < Q; i++) {
            orders.add(new Order(sc.nextInt() - 1, sc.nextInt() - 1, sc.nextInt(), sc.nextInt()));
        }

        for(int i=0;i<N;i++){
            int[] A = new int[N];
            expand(A, i, 0, M, orders);
        }
        System.out.println(ans);
    }

    void expand(int[] A, int index, int num, int M, ArrayList<Order> orders){
        if(index == A.length){
            int ret = 0;
            for(Order o:orders){
                if(A[o.b]-A[o.a]==o.c)
                    ret += o.d;
            }
            ans = Math.max(ans,ret);
        }else{
            A[index] = num;
            for(int k=A[index]; k<M;k++){
                int[] B = A.clone();
                expand(B, index+1, k, M, orders);
            }
        }
    }

    class Order {
        int a;
        int b;
        int c;
        int d;

        Order(int a, int b, int c, int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
