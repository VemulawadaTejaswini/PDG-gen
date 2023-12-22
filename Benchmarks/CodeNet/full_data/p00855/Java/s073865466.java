import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int max = 1500000;
        int[] p = new int[max];
        for(int i=2; i<p.length; i++) p[i] = 1;
        for(int i=2; i<Math.sqrt(max)+1; i++){
            for(int j=i*2; j<max; j+=i) p[j] = 0;
        }

        while(true){
            int n = sc.nextInt();
            if(n==0) break;

            int idx1 = n, idx2 = n;
            while(p[idx1]!=1) idx1--;
            while(p[idx2]!=1) idx2++;
            System.out.println(idx2 - idx1);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}