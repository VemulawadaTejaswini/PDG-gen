import java.util.*;

public class Main{

    int p1,p2;
    boolean[] used;
    int[] c1,c2,per;

    void solve(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n-->0){
            c1 = new int[9];
            c2 = new int[9];
            for(int i=0; i<9; i++) c1[i] = sc.nextInt();
            for(int i=0; i<9; i++) c2[i] = sc.nextInt();

            p1 = 0; p2 = 0;
            used = new boolean[9];
            per = new int[9];
            dfs(0);

            double all = p1+p2;
            System.out.printf("%.5f %.5f\n",p1/all,p2/all);
        }
    }

    void dfs(int pos){
        if(pos==9){
            int s1 = 0, s2 = 0;
            for(int i=0; i<9; i++){
                if(c1[per[i]]>c2[i]) s1 += c1[per[i]] + c2[i];
                else s2 += c1[per[i]] + c2[i];
            }
            if(s1>s2) p1++;
            if(s1<s2) p2++;
            return;
        }
        
        for(int i=0; i<9; i++){
            if(used[i]) continue;
            used[i] = true;
            per[pos] = i;
            dfs(pos+1);
            used[i] = false;
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}