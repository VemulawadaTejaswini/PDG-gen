import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int min = 1;
        int max = N;
        for(int i=0; i<M; i++){
            int L = sc.nextInt();
            int R = sc.nextInt();
            if(L > min) min = L;
            if(R < max) max = R;
        }

        System.out.println(max-min+1);
    }
}