import java.util.*;

public class Main {

static int N;
static int[] bit = new int[1000010];

public static void add(int a, int w) {
    for (int i=a;i<=N;i+=i&(-i)) {
        bit[i]+=w;
    }
}

public static int sum(int a) {
    int ret = 0;
    for (int i=a;i>0;i-=i&(-i)) {
        ret+=bit[i];
    }
    return ret;
}

public static int get(int k) { // 0_indexed find
    ++k;
    int res = 0;
    int nn = 1; while (nn < (int)N) nn *= 2;
    for (int i = nn / 2; i > 0; i /= 2) {
        if (res + i < (int)N && bit[res + i] < k) {
            k = k - bit[res + i];
            res = res + i;
        }
    }
    return res + 1;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        N = n+2;
        int[] A = new int[n];
        int[] inv = new int[n];
        for (int i=0;i<n;i++) {
            A[i] = Integer.parseInt(sc.next());
            inv[A[i]-1] = i;
        }
        long ans = 0L;
        add(1, 1);
        add(N+2, 1);
        for (int i=0;i<n;i++) {
            int index = inv[i]+1;
            ans+=((index+1)-get(sum(index)-1))*(get(sum(index))-(index+1))*(i+1);
            add(index+1, 1);
        }
        System.out.println(ans);
    }
}