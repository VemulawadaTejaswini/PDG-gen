import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int l[] = new int[N];
        for(int i=0; i<N; i++) {
            l[i] = sc.nextInt();
        }
        int result = Integer.MAX_VALUE;
        int LIMIT = pow(4, N);
        for(int type=0; type<LIMIT; type++) {
            int bucket[] = new int[3];
            int b_count[] = new int[3];
            int tmp_masic = 0;
            for(int i=0; i<N; i++) {
                int m = (type / pow(4, i)) % 4;
                if(m==3) continue;
                bucket[m]+=l[i];
                b_count[m]++;
            }

            boolean ng = false;
            for(int k=0; k<3; k++) {
                if(b_count[k]<=0) {
                    ng=true;
                    break;
                }
            }
            if(ng) continue;

            for(int k=0; k<3; k++) {
                tmp_masic+=(b_count[k]-1)*10;
                int target=0;
                switch(k) {
                    case 0:
                        target=A;
                        break;
                    case 1:
                        target=B;
                        break;
                    case 2:
                        target=C;
                        break;
                }
                tmp_masic+=Math.abs(bucket[k]-target);
            }
            if(tmp_masic<result) {
                result = tmp_masic;
            }
        }
        System.out.println(result);
    }

    static int pow(int base, int p) {
        if(p==0) return 1;
        return base * pow(base, p-1);
    }
}