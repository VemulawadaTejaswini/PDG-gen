import java.util.*;


/**
 * Created by takaesumizuki on 2017/06/14.
 */

public class Main {

    Long c[][] = new Long[50][50];

    void run() {
        Scanner sc = new Scanner(System.in);
        makeCombi();
        int N = sc.nextInt();
        int P = sc.nextInt();
        Long sum = 0l;
        int a = 0;
        int b = 0;
        for (int i = 0; i < N; i++) {
            int tmp = sc.nextInt();
            if(tmp % 2 == 1) a++;
            else b++;
        }

        if(P == 0){
            for(int i = 1; i <= a; i += 2){
                sum += c[a][i] * (int)Math.pow(2.0, b);
            }
        }else{
            for(int i = 0; i <= a; i += 2){
                sum += c[a][i] * (int)Math.pow(2.0, b);
            }
        }
        System.out.println(sum);

    }

    private void makeCombi() {
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) c[i][j] = 1l;
                else if (i == j) c[i][j] = 1l;
                else c[i][j] = c[i - 1][j - 1] + c[i - 1][j];
            }
        }

    }


    public static void main(String[] args) {
        new Main().run();
    }

}

