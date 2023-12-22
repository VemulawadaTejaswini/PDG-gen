import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(), B = sc.nextInt();
        int[] a = new int[A];
        int[] b = new int[B];
        for(int i=0; i<A; i++) a[i] = sc.nextInt();
        for(int i=0; i<B; i++) b[i] = sc.nextInt();

        int[][] aa = new int[1001][];
        for(int i=1; i<=1000; i++){
            int cnt = 0;
            for(int j=0; j<A; j++) 
                if(a[j]==i) cnt++;
            aa[i] = new int[cnt];
            int idx = 0;
            for(int j=0; j<A; j++)
                if(a[j]==i) aa[i][idx++] = j;
        }

        int max = 0;
        for(int start = 0; start < B; start++){
            int cnt = 0, pos = -1;
            for(int i=start; i<B; i++){
                int before = cnt;
                for(int j=0; j<aa[b[i]].length; j++){
                    if(aa[b[i]][j]>pos){
                        cnt++;
                        pos = aa[b[i]][j];
                        break;
                    }
                }
                if(before==cnt) break;
            }
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}