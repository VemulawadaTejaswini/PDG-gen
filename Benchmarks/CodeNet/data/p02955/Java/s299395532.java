import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int asum=0;
        for(int p=0;p<n;p++) {
            a[p] = sc.nextInt();
            asum += a[p];
        }
        List<Integer> insi = ys(asum);
        for(Integer p :insi){
            int nowSum = 0;
            int i=0;
            int rem = 0;
            for(i =0; i<n-1;i++){
                int s = nearest(p,a[i]);
                nowSum += Math.abs(s);
                rem += s;
                if(nowSum > 2*k){
                    break;
                }
            }
            if(i == n-1){
                //Succeed;
                if(nowSum + Math.abs(rem) <= 2*k){
                    System.out.println(p);
                    return;
                }
            }
        }
        System.out.println(ys(asum));
    }

    public static List<Integer> ys(int k){
        List<Integer> ret = new ArrayList<>();
        for(int y=1;y<Math.sqrt(k);y++){
            if(k % y == 0){
                ret.add(y);
                ret.add(k/y);
            }
        }
        ret.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        return ret;
    }

    public static int nearest(int p, int a){
        int f = a/p;
        int s_p = p*(f+1)-a;
        int s_m = a-p*f;
        if(s_p < s_m){
            return s_p;
        }else{
            return -s_m;
        }
    }
}
