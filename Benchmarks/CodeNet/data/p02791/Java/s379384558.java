import java.util.*;

class Main{

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        int N;
        N = Integer.parseInt(scanner.next());

        int[] P = new int[N];

        for(int i=0;i<N;i++)
            P[i] = Integer.parseInt(scanner.next());


        int[] M = new int[N];
        int max=0;
        for(int i=N-1;i>=0;i--){
            int j;
            for(j=0;j<max;j++){
                if(P[i]<M[j]) break;
            }
            if(max == j) max++;
            M[j] = P[i];
        }

        System.out.println(max);
    }
}
