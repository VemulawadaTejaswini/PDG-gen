import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] A = new int[N+1];
        int[] L = new int[N+1];
        Map<Integer, Integer> l = new HashMap<>();
        int[] R = new int[N+1];
        Map<Integer, Integer> r = new HashMap<>();
        
        for(int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(sc.next());
            
            L[i] = A[i]+i;
            if(l.containsKey(L[i])) { l.put(L[i], l.get(L[i])+1); }
            else { l.put(L[i],1); }
            
            R[i] = i-A[i];
            if(r.containsKey(R[i])) { r.put(R[i], r.get(R[i])+1); }
            else { r.put(R[i],1); }
        }
        
        int ans = 0;

        for(int x : r.keySet()) {
            if(l.containsKey(x)) {
                ans += r.get(x) * l.get(x);
            }
        }
        
        System.out.println(ans);
    }
}