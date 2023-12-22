import java.util.*;
import java.util.concurrent.atomic.LongAccumulator;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        long[] A = new long[(int)N];
        long[] memo = new long[(int)N];

        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        
        boolean f = false;
        long count = 0;
        long index = 0;
        long tmp = 0;

        while(f == false) {
            tmp = A[(int)tmp];
            memo[(int)index] = A[(int)tmp];
            index++;
            count++;
            if(tmp == 1) f=true; //もし，街１に戻ってきたら
        }
        count++;
        
        long t = K % count;
        if(t == 0) t=K;

        System.out.println(memo[(int)t - 1]);
    }
}