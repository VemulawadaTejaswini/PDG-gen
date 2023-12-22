import java.util.*;


public class Main {
    static Scanner s = new Scanner(System.in);
    static class Load implements Comparable<Load> {
        int D;
        int P;

        Load(int d, int p) {
            D = d;
            P = p;
        }
        public int compareTo(Load a){
            int Pa = a.P;
            int Pb = this.P;

            return Pa-Pb;
        }
    }

    public static void main(String[] args) {
        while (true) {
            int N = s.nextInt();
            int M = s.nextInt();
            if(N==0 && M==0) break;

            Load[] load = new Load[N];
            for(int i=0;i<N;i++){
                int d = s.nextInt();
                int p = s.nextInt();
                load[i] = new Load(d,p);
            }
            Arrays.sort(load);

            int totalP =0;
            for(int i=0;i<N;i++){
                if(M>=load[i].D){
                    M-=load[i].D;
                    continue;
                } else{
                    totalP+=(load[i].D-M)*load[i].P;
                }
            }
            System.out.println(totalP);
        }
    }
}