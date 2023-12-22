import java.util.*;

public class Main {

    static int mod = 1000000007;

    static long gcd(long a,long b) {
        long temp;
        while ((temp=a%b)!=0) {
            a=b;
            b=temp;
        }
        return b;
    }

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

    static long modinv(long n) {
        return pow(n, mod-2);
    }

    static class Pair{
        public long x;
        public long y;
        public Pair(long x,long y) {
            this.x=x;
            this.y=y;
        }
        @Override
        public boolean equals(Object obj) {
            if(obj instanceof Pair) {
                Pair other = (Pair) obj;
                return other.x==this.x && other.y==this.y;
            }
            return false;
        }
        @Override
        public int hashCode() {
            return Objects.hash(this.x,this.y);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        long[] B = new long[N];
        int zero_A = 0;
        int zero_B = 0;
        int zero_A_B = 0;
        HashMap<Pair, Integer> map = new HashMap<Pair, Integer>();
        for (int i=0;i<N;i++) {
            A[i] = sc.nextLong();
            B[i] = sc.nextLong();
            if (A[i] == 0 && B[i] == 0) {
                zero_A_B++;
                continue;
            } else if (A[i] == 0) {
                zero_A++;
                continue;
            } else if (B[i] == 0) {
                zero_B++;
                continue;
            }
            long gcd_ = gcd(A[i], B[i]);
            A[i] /= gcd_;
            B[i] /= gcd_;
            if (A[i]<0) {
                A[i] *= -1;
                B[i] *= -1;
            }
            Pair pair = new Pair(A[i], B[i]);
            if (map.containsKey(pair)) {
                map.put(pair, map.get(pair)+1);
            } else {
                map.put(pair, 1);
            }
        }
        HashSet<Pair> set = new HashSet<Pair>(map.keySet());
        ArrayList<Pair> keys = new ArrayList<Pair>(map.keySet());

        long ans = pow(2, N-zero_A_B);
        for (int i=0;i<keys.size();i++) {
            Pair tmp = keys.get(i);
            long x_ = tmp.y*(-1);
            long y_ = tmp.x;
            if (x_ < 0) {
                x_ *= -1;
                y_ *= -1;
            }
            Pair pair = new Pair(x_, y_);
            if (set.contains(pair)) {
                set.remove(pair);
                set.remove(tmp);
                int cnt_1 = map.get(pair);
                int cnt_2 = map.get(tmp);
                // System.out.println("pair: "+pair.x+" "+pair.y);
                // System.out.println("cnt_1, cnt_2: "+cnt_1+" "+cnt_2);
                ans = ans * (pow(2, cnt_1) + pow(2, cnt_2) - 1 + mod) % mod * modinv(pow(2, cnt_1+cnt_2)) % mod;
            }
        }
        ans = ans * (pow(2, zero_A) + pow(2, zero_B) - 1 + mod) % mod * modinv(pow(2, zero_A+zero_B)) % mod;
        ans = (ans + zero_A_B) % mod;
        System.out.println((ans-1+mod)%mod);

        // System.out.println("zero_A_B: "+zero_A_B);
        // System.out.println("zero_A: "+zero_A);
        // System.out.println("zero_B: "+zero_B);

        // ArrayList<Integer> vals = new ArrayList<Integer>(map.values());
        // for (int i=0;i<keys.size();i++) {
        //     System.out.println("A, B: "+keys.get(i).x+" "+keys.get(i).y);
        //     System.out.println("val: "+vals.get(i));
        // }
    }
}