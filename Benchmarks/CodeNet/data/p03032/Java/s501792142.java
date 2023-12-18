import java.util.*;

public class Main {

    private static long[] vim;
    private static int n;
    private static int k;
    private static PriorityQueue<Long> p;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        p = new PriorityQueue<>();
        vim = new long[n];
        for(int i=0;i<n;i++){
            vim[i] = in.nextLong();
        }
        long max=0;
        //i表示左边取的操作的次数
        for(int i=0;i<k;i++){
            //j表示右边取操作的次数，左右两边取的次数最多不超过k次，或者不超过数的个数
            for(int j=0;(i+j)<Math.min(n,k);j++){
                max=Math.max(max,solute(i,j));
            }
        }
        System.out.println(max);
    }
    public static long solute(int l,int r){
        p.clear();
        long sum = 0;
        for(int i=0;i<l;i++){//放入左边的l个数字
            p.add(vim[i]);
            sum +=vim[i];
        }
        for(int j=0;j<r;j++){//放入右边的r个数字
            p.add(vim[n-j-1]);
            sum+=vim[n-j-1];
        }
        //考虑放的操作，因为取用了l+r次，所以最多可以放(k-l-r）次，直接选择最小的(k-l-r)个负数放
        int i = 0;
        while(!p.isEmpty() && p.peek()<0 && i<k-l-r){
            sum-=p.poll();
            i++;
        }
        return sum;
    }
}
