import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();
        int v = sc.nextInt();
        int p = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int l = -1;
        int r = n-1;
        int tgt = a[n-p];
        long maxNoVote = (n-v)*1L*m;
        while(l+1 < r){
            int mid = (r+l)/2;
            if(n-p <= mid) r = mid;
            else{
                if(a[mid]+m < tgt) l = mid;
                else{
                    long max = a[mid]+m;
                    long noVote = 0L;
                    boolean able = true;
                    for (int i = mid+1; i <= n-p; i++) {
                        long nv = m - (max - a[i]);
                        if(m < nv){
                            able = false;
                            break;
                        }
                        noVote += nv;
                    }
                    if(!able || maxNoVote < noVote){
                        l = mid;
                    }else{
                        r = mid;
                    }
                }
            }
        }
        System.out.println(n - r);
        sc.close();

    }

}
