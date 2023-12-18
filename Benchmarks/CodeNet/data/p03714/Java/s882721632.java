import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n*3];
        for(int i=0; i<n*3; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        //前N個をプライオリティキューに突っ込む
        long fsum = 0L;
        PriorityQueue<Integer> fq = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            fsum += a[i];
            fq.add(a[i]);
        }
        
        long[] fk = new long[n+1];
        fk[0] = fsum;
        //前2N個のうちK個捨てる。
        for(int k=1; k<=n; k++){
            fsum += a[n+k-1];
            fsum -= fq.poll();
            fk[k] = fsum;
        }
        
        //後ろN個をプライオリティキューに突っ込む
        long rsum = 0L;
        PriorityQueue<Integer> rq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=n*3-1; i>=n*2; i--){
            rsum += a[i];
            rq.add(a[i]);
        }
        
        long[] rk = new long[n+1];
        rk[0] = rsum;
        //後ろ2N個のうちK個捨てる。
        for(int k=1; k<=n; k++){
            rsum += a[n*2-k];
            rsum -= rq.poll();
            rk[k] = rsum;
        }
        
        long max = -(1L<<60);
        //前K個+後ろK個が丁度N個になるモノで最大を取る
        for(int i=0; i<=n; i++){
            long tmp = fk[i] - rk[n-i];
            max = Math.max(max, tmp);
        }
        
        System.out.println(max);
        
    }
}

