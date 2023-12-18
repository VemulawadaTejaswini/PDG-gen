import java.util.*;

public class Main {

    static int mod = 1_000_000_007;
static long pow(long a,int n) {
    long res=1;
    while (n>0) {
        if ((n-n/2*2)==1) {
            res=res*a%mod;
        }
        a=a*a%mod;
        n>>=1;
    }
    return res;
}

static ArrayList<int[]> factorization (int n) {
    ArrayList<int[]> list = new ArrayList<int[]>();
    int tmp= n ;
    for (int i=2;i<=Math.sqrt(n);i++) {
        if (tmp%i==0) {
            int cnt=0;
            while (tmp%i==0) {
                cnt++;
                tmp/=i;
            }
            int[] x = {i, cnt};
            list.add(x);
        }
    }
    if (tmp!=1) {
        int[] x = {tmp, 1};
        list.add(x);
    }

    if (list.size()==0) {
        int[] x = {n, 1};
        list.add(x);
    }
    return list;
}

static long modinv(long n) {
    return pow(n, mod-2);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
            ArrayList<int[]> list = factorization(A[i]);
            for (int[] arr : list) {
                if (!map.containsKey(arr[0])) {
                    map.put(arr[0], arr[1]);
                } else {
                    if (map.get(arr[0])<arr[1]) {
                        map.put(arr[0], arr[1]);
                    }
                }
            }
        }


        ArrayList<Integer> key = new ArrayList<Integer>(map.keySet());
        ArrayList<Integer> val = new ArrayList<Integer>(map.values());
        long lcm = 1L;
        for (int j=0;j<key.size();j++) {
            lcm = lcm*pow(key.get(j), val.get(j))%mod;
        }

        long ans = 0L;
        for (int i=0;i<N;i++) {
            ans = (ans+lcm*modinv(A[i])%mod)%mod;
        }
        System.out.println(ans);
    }
}
