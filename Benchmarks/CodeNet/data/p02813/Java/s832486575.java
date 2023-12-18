import java.util.*;

class Main {
    int N, P, Q;
    boolean P_OK = false, Q_OK = false;
    int P_Num = 0, Q_Num = 0;

    public Main(){
        Scanner SC = new Scanner(System.in);

        N = SC.nextInt();

        P = Q = 0;
        for(int i=0;i<N;i++){
            P *= 10;
            P += SC.nextInt();
        }
        for(int i=0;i<N;i++){
            Q *= 10;
            Q += SC.nextInt();
        }

        permutation();

        System.out.println(Math.abs(Q_Num-P_Num));
    }

    void permutation(){
        int seed[] = new int[N];
        boolean[] used = new boolean[N];

        for(int i=0;i<N;i++) seed[i] = i+1;

        buildPerm(seed, 0, used, 0);
    }

    void buildPerm(int[] seed, int perm, boolean[] used, int index){
        if(P_OK && Q_OK) return;

        if(index == N){
            if(!P_OK){
                if(P > perm)
                    P_Num++;
                else
                    P_OK = true;
            }
            if(!Q_OK){
                if(Q > perm)
                    Q_Num++;
                else
                    Q_OK = true;
            }
            return;
        }

        perm *= 10;
        for(int i=0;i<N;i++){
            if(used[i]) continue;
            used[i] = true;
            buildPerm(seed, perm + seed[i], used, index+1);
            used[i] = false;
        }
    }

    public static void main(String[] args){
        Main m = new Main();
    }
}
