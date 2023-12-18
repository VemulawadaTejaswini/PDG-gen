import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    
 
    public static void main(String[] args)  {
        new Main().solve();
    }

    void solve(){
        Scanner sc = new Scanner(System.in);
        int N, M;
        N = Integer.parseInt(sc.next());
        M = Integer.parseInt(sc.next());
        int s;
        int c;
        boolean[] bool = new boolean[N+1];
        int[] res = new int[N+1];

        s = Integer.parseInt(sc.next());
        c = Integer.parseInt(sc.next());

        if(N>1 && s==1 && c==0){
            System.out.println("-1");
            System.exit(0);
        }

        bool[s] = true;
        res[s] = c;
        for(int i=1; i<M ; i++){
            s = Integer.parseInt(sc.next());
            c = Integer.parseInt(sc.next());

            if(N>1 && s==1 && c==0){
                System.out.println("-1");
                System.exit(0);
            }

            if(bool[s] && res[s]!=c ){
                System.out.println("-1");
                System.exit(0);

            }

            bool[s] = true;
            res[s] = c;
        }
        sc.close();

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<N; i++){
            list.add(res[i+1]);
        }

        for(int i=0; i<N; i++){
            System.out.print(list.get(i));
        }


    }
}