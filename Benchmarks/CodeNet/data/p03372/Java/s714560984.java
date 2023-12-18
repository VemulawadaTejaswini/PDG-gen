import java.util.*;

import javax.transaction.xa.Xid;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int NN = 2 * N;
        int x[] = new int[N];
        int v[] = new int[N];

        for(int h = 0; h < NN; h++){
            if(h % 2 == 0){
                int n = h / 2;
                x[n] = sc.nextInt();
            }else{
                int n = h - 1;
                n = n / 2;
                v[n] = sc.nextInt();
            }
        }

        int cal = 100;
        int anss[] = new int[N];

        for(int g = 0; g < N; g++){
            for(int f = 0; f < g; f++){
                x[g] -= x[f];
            }
        }

        for(int i = 0; i < N; i++){
            cal = cal + v[i] - x[i];
            anss[i] = cal;
            System.out.println(cal - 100);
        }

        Arrays.sort(anss);
        anss[N - 1] = anss[N - 1] - 100;
        System.out.println(anss[N - 1]);
    }
}