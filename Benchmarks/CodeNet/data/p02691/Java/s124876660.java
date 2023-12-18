import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long[] A = new long[N+1];
        long[] L = new long[N+1];
        Map<Long, Integer> l = new HashMap<>();
        long[] R = new long[N+1];
        Map<Long, Integer> r = new HashMap<>();
        long lmax = 0;
        long rmin = 1000000000;
        for(int i = 1; i <= N; i++) {
            A[i] = Long.parseLong(sc.next());
            L[i] = A[i]+i;
            if(l.containsKey(L[i])) { l.put(L[i], l.get(L[i])+1); }
            else { l.put(L[i],1); }
            R[i] = i-A[i];
            if(r.containsKey(R[i])) { r.put(R[i], r.get(R[i])+1); }
            else { r.put(R[i],1); }
            
            if(lmax < L[i]) {
                lmax = L[i];
            }
            if(rmin > R[i]) {
                rmin = R[i];
            }
        }
        long ans = 0;
        /*
        for(long x = rmin; x <= lmax; x++) {
            if(l.containsKey(x) && r.containsKey(x)) {
                ans += l.get(x) * r.get(x);
            }
        }
        */
        
        for(long x : l.keySet()) {
            if(r.containsKey(x)) {
                ans += l.get(x) * r.get(x);
            }
        }
        
        System.out.println(ans);
    }
}