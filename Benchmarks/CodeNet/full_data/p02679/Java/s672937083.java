import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    long MOD = 1000000007L;

    class SearchKey {
        long A, B;

        public SearchKey(long A, long B){
            long GCD = gcd(Math.abs(A), Math.abs(B));
            this.A = A/GCD;
            this.B = B/GCD;
        }

        @Override
        public int hashCode() {
            return Objects.hash(A, B);
        }

        @Override
        public boolean equals(Object obj) {
            if(obj instanceof SearchKey){
                SearchKey key = (SearchKey) obj;
                return this.A == key.A && this.B == key.B;
            } else {
                return false;
            }
        }

        long gcd(long A, long B){
            if(B == 0) return A;
            return gcd(B, A%B);
        }

    }

    public Main(){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        HashMap<SearchKey, Integer> C = new HashMap<SearchKey, Integer>();
        long ZZ=0, AZ=0, BZ=0;

        for(int i=0;i<N;i++){
            long A = Long.parseLong(sc.next());
            long B = Long.parseLong(sc.next());

            if(A == 0 && B == 0){
                ZZ++;
            } else if(A == 0 && B != 0){
                AZ++;
            } else if(A != 0 && B == 0){
                BZ++;
            } else {
                SearchKey key = new SearchKey(A, B);
                C.put(key, C.getOrDefault(key, 0) + 1);
            }
        }

        long T, normal = 0;

        if(AZ == 0 || BZ == 0){
            T = 1;
            normal += AZ + BZ;
        } else {
            T = modPow(2, AZ) + modPow(2,BZ) - 1;
        }

        HashMap<SearchKey, Integer> temp = new HashMap(C);
        for(SearchKey key : C.keySet()) {
            if(!temp.containsKey(key)) continue;

            long R = C.getOrDefault(new SearchKey(-key.B, key.A),0)
                   + C.getOrDefault(new SearchKey(key.B, -key.A),0);

            if(R == 0){
                normal += C.get(key);
            } else {
                T = T * (( modPow(2, C.get(key)) + modPow(2, R) - 1 ) % MOD) % MOD;

                temp.remove(key);
                temp.remove(new SearchKey(-key.B, key.A));
                temp.remove(new SearchKey(key.B, -key.A));
            }
        }

        T = T * (modPow(2, normal)) % MOD - 1 + ZZ;

        System.out.println(T);
    }

    public static void main(String[] args) {
        Main M = new Main();
    }

    long modPow(long a, long b){
        long R = 1L;

        a %= MOD;
        while(b > 0){
            if( (b & 1) == 1)
                R = (R * a) % MOD;
            a = (a * a) % MOD;
            b = b >> 1;
        }

        return R;
    }
}
