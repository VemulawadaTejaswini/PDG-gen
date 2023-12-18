import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        //int[] p = new int[M];
        //String[] S = new String[M];

        int[] ac = new int[N];
        int pena = 0;

        for(int i=0; i<M; i++){
            int p = sc.nextInt();
            String S = sc.next();
            p--;
            if(ac[p] == 1) continue;
            if(S.equals("AC")){
               ac[p] = 1;
            } else {
                pena++;
            }
        }

        int ans = Arrays.stream(ac).sum();
        System.out.println(ans + " " + pena);

    }
}
