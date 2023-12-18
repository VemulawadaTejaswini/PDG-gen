import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        boolean flags[] = new boolean[n];
        for (int i = 0;i < n;++i){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        LinkedList<Long> output = new LinkedList<>();
        output.push(a[0]);
        for (int i = 1;i < n;++i){
            long k = (i & 1) == 1 ? a[n - 1 - (i - 1) / 2] : a[i / 2];
            long t1 = Math.abs(output.getFirst() - k);
            long t2 = Math.abs(output.getLast() - k);
            if(t1 > t2){
                output.addFirst(k);
            }
            else output.addLast(k);
        }
        long r = 0;
        long last = -1;
        for (long l:output){
            if(last >= 0)r += Math.abs(l - last);
            last = l;
        }
        System.out.println(r);

    }




}


