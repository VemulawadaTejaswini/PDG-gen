import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[3*n];
        for(int i=0;i<3*n;i++){
            a[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        long[] lsum = new long[3*n+1];
        PriorityQueue<Integer> right = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        PriorityQueue<Integer> left = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            lsum[i+1] = lsum[i] + a[i];
            left.add(a[i]);
        }
        Integer tmp;
        for(int i=n;i<2*n;i++){
            tmp = left.peek();
            if(a[i] > tmp){
                lsum[i+1] = lsum[i] + a[i] - tmp;
                left.poll();
                left.add(a[i]);
            }else{
                lsum[i+1] = lsum[i];
            }
        }
        long[] rsum = new long[3*n+1];
        for(int i=3*n;i>2*n;i--){
            rsum[i-1] = rsum[i] + a[i-1];
            right.add(a[i-1]);
        }

        for(int i=2*n;i>n;i--){
            tmp = right.peek();
            if(a[i-1] < tmp){
                rsum[i-1] = rsum[i] + a[i-1] - tmp;
                right.poll();
                right.add(a[i-1]);
            }else{
                rsum[i-1] = rsum[i];
            }
        }
        long max = Long.MIN_VALUE;
        for(int i=n;i<=2*n;i++){
            max = Math.max(max, lsum[i] - rsum[i]);
        }
        System.out.println(max);
        

    }

}