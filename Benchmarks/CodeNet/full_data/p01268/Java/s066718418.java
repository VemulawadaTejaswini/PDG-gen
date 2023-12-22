import java.util.*;

public class Main{

    int[] p;
    int MAX = 1000000;

    void solve(){
        Scanner sc = new Scanner(System.in);

        p = new int[MAX];
        for(int i=2; i<p.length; i++)p[i] = 1;
        for(int i=2; i<Math.sqrt(MAX)+1; i++){
            for(int j=i*2; j<MAX; j+=i){
                p[j] = 0;
            }
        }

        while(true){
            int n = sc.nextInt();
            int P = sc.nextInt();
            if(n==-1 && P==-1) break;

            int[] array = new int[10000];
            Arrays.fill(array,Integer.MAX_VALUE);
            int idx = 0;
            for(int i=n+1; i<n+300; i++){
                if(p[i]==0) continue;
                for(int j=i; j<n+300; j++){
                    if(p[j]==0) continue;
                    array[idx] = i+j;
                    idx++;
                }
            }

            Arrays.sort(array);

            System.out.println(array[P-1]);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}