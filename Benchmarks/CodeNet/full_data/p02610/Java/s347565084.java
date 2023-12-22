import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            PriorityQueue<int[]> lq = new PriorityQueue<>((x,y) -> x[0]-y[0]);
            PriorityQueue<int[]> rq = new PriorityQueue<>((x,y) -> y[0]-x[0]);
            for (int j = 0; j < n; j++) {
                int k = sc.nextInt();
                int l = sc.nextInt();
                int r = sc.nextInt();
                if(l < r){
                    rq.add(new int[]{k, l, r, r-l});
                }else{
                    lq.add(new int[]{k, l, r, l-r});
                }
            }
            long ans = 0L;
            PriorityQueue<int[]> cq = new PriorityQueue<>((x,y) -> x[3] - y[3]);
            for(int[] a : lq){
                int ck = a[0];
                int cl = a[1];
                int cr = a[2];
                int cd = a[3];
                if(cq.size() < ck){
                    cq.add(a);
                    ans += (long)cl;
                }else{
                    int[] tmp = cq.peek();
                    if(tmp[3] < cd){
                        cq.poll();
                        cq.add(a);
                        ans += (long)cl + (long)tmp[2] -(long)tmp[1];
                    }else{
                        ans += (long)cr;
                    }
                }
            }
            cq = new PriorityQueue<>((x,y) -> x[3] - y[3]);
            for(int[] a : rq){
                int ck = a[0];
                int cl = a[1];
                int cr = a[2];
                int cd = a[3];
                if(cq.size() < n-ck){
                    cq.add(a);
                    ans += (long)cr;
                }else{
                    int[] tmp = cq.peek();
                    if(tmp != null && tmp[3] < cd){
                        cq.poll();
                        cq.add(a);
                        ans += (long)cr + (long)tmp[1] -(long)tmp[2];
                    }else{
                        ans += (long)cl;
                    }
                }
            }
            sb.append(ans + "\n");
        }
        System.out.println(sb.toString());
        sc.close();

    }

}

