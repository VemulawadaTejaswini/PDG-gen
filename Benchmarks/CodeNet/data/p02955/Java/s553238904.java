import java.util.*;

public class Main {

    static ArrayList<Integer> divisor(int x) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i=1;i*i<=x;i++) {
            if (x%i==0) ans.add(i);
            if (x%i==0 && i*i!=x) ans.add(x/i);
        }
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int[] A = new int[N];
        int sum = 0;
        for (int i=0;i<N;i++) {
            A[i] = Integer.parseInt(sc.next());
            sum += A[i];
        }
        ArrayList<Integer> list = divisor(sum);
        for (int i=list.size()-1;i>=0;i--) {
            int tmp = list.get(i);
            int[] B = new int[N];
            for (int j=0;j<N;j++) {
                B[j] = A[j]%tmp;
            }
            Arrays.sort(B);
            int right = N-1;
            long cnt = 0L;
            for (int j=0;j<N;j++) {
                if (j>=right) break;
                int val = B[j];
                cnt += val;
                // while (val>0) {
                //     if (tmp-B[right]>val) {
                //         B[right]+=val;
                //         val-=val;
                //     } else { //  tmp-B[right]<=val
                //         B[right]+=tmp-B[right];
                //         val-=tmp-B[right];
                //         right--;
                //     }
                // }
            }
            if (cnt<=K) {
                System.out.println(tmp);
                return;
            }
        }
    }
}