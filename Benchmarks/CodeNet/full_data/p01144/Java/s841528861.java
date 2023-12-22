import java.util.*;

public class Main{
    int n,m;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            n = sc.nextInt();
            m = sc.nextInt();
            if(n==0 && m==0) break;

            PriorityQueue<int[]> q 
                = new PriorityQueue<int[]>(n,new Comparator<int[]>(){
                        public int compare(int[] a, int[] b){
                            return b[1]-a[1];
                        }
                    });

            for(int i=0; i<n; i++){
                int d = sc.nextInt();
                int p = sc.nextInt();
                q.add(new int[]{d,p});
            }

            int ans = 0;
            while(q.size()>0){
                int[] qq = q.poll();
                int d = qq[0], p = qq[1];
                while(m>0 && d>0){
                    m--;
                    d--;
                }
                while(d>0){
                    d--;
                    ans += p;
                }
            }

            System.out.println(ans);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}