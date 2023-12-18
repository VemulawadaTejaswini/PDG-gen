import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        long b = 0L;
        int cnt = 0;
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            if(x == 1){
                int y = sc.nextInt();
                int ok = cnt;
                int ng = -1;
                while(1 < Math.abs(ok - ng)){
                    int mid = (ok + ng) / 2;
                    if(y < a.get(mid)) ok = mid;
                    else ng = mid;
                }
                a.add(ok, y);
                b += sc.nextLong();
                cnt++;
            }else{
                int idx = (cnt-1) / 2;
                long sum = b;
                for (int j = 0; j < cnt; j++) {
                    sum += Math.abs(a.get(idx) - a.get(j));
                }
                System.out.println(a.get(idx) + " " + sum);
            }
        }
        sc.close();

    }

}
