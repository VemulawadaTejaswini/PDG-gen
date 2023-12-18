import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        long ans = 0;
        
        int[] idx = new int[n];
        for(int i=0; i<n; i++){
            idx[a[i]-1] = i;
        }
        
        TreeSet<Integer> s = new TreeSet<Integer>();
        for(int i=n-1; i>=0; i--){
            int x = idx[i];
            s.add(x);
            int l1 = -1 , l2 = -1;
            int r1 = n, r2 = n;
            Integer tmp;
            
            if((tmp = s.lower(x)) != null){
                l2 = tmp;
                if((tmp = s.lower(tmp)) != null){
                    l1 = tmp;
                }
            }
            if((tmp = s.higher(x)) != null){
                r1 = tmp;
                if((tmp = s.higher(tmp)) != null){
                    r2 = tmp;
                }
            }
            
            long w1 = (l2-l1)*(r1-x);
            long w2 = (x-l2)*(r2-r1);
            ans += (w1+w2)*(i+1);
        }
        
        System.out.println(ans);
    }
}
