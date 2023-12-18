import java.util.*;

class Main{

    Main(){
        Scanner SC = new Scanner(System.in);
        int N = Integer.parseInt(SC.next());
        int M = Integer.parseInt(SC.next());

        int[] R = new int[N];

        for(int i=0;i<N;i++){
            R[i] = -1;
        }

        for(int i=0;i<M;i++){
            int S = Integer.parseInt(SC.next());
            int C = Integer.parseInt(SC.next());

            if(R[S-1] == -1){
                R[S-1] = C;
            } else {
                if(R[S-1] != C){
                    System.out.println(-1);
                    return;
                }
            }
        }

        if(N == 1){
            if(R[0] == -1){
                R[0] = 0;
            }
        } else {
            if(R[0] == 0){
                System.out.println(-1);
                return;
            } else if(R[0] == -1){
                R[0] = 1;
            }

            for(int i=1;i<N;i++){
                if(R[i] == -1){
                    R[i] = 0;
                }
            }
        }

        for(int i=0;i<N;i++){
            System.out.print(R[i]);
        }
        System.out.println("");
    }

    public static void main(String[] args){
        Main main = new Main();
    }
}
