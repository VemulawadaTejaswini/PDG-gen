import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt(), m = sc.nextInt(), a = sc.nextInt();
            if(n==0 && m==0 && a==0) break;

            int[][] amida = new int[m][n];
            for(int i=0; i<m; i++) Arrays.fill(amida[i], -1);

            for(int i=0; i<m; i++){
                int h = sc.nextInt()-1, p = sc.nextInt()-1, q = sc.nextInt()-1;
                amida[h][p] = q;
                amida[h][q] = p;
            }

            int idx1 = 0, idx2 = a;
            while(idx1<m){
                if(amida[idx1][idx2]!=-1) idx2 = amida[idx1][idx2];
                idx1++;
            }
            
            System.out.println(idx2+1);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}