import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int INF = Integer.MAX_VALUE;

        ArrayList<Integer> pol = new ArrayList<Integer>();
        int num = 1;
        int po = num*(num+1)*(num+2)/6;
        while(po < 1000000){
            pol.add(new Integer(po));
            num++;
            po = num*(num+1)*(num+2)/6;
        }

        int[] cnt = new int[1000000];
        int[] cnt2 = new int[1000000];
        Arrays.fill(cnt, INF);
        Arrays.fill(cnt2, INF);
        cnt[0] = 0;
        cnt2[0] = 0;
        for(int i=0; i<pol.size(); i++){
            int pp = pol.get(i);
            for(int j=pp; j<1000000; j++){
                cnt[j] = Math.min(cnt[j], cnt[j-pp]+1);
                if(pp%2==1) cnt2[j] = Math.min(cnt2[j], cnt2[j-pp]+1);
            }
        }

        while(true){
            int n = sc.nextInt();
            if(n==0) break;

            System.out.println(cnt[n]+" "+cnt2[n]);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}