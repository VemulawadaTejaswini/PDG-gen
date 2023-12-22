import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int k = sc.nextInt();
        int[] arrMod = new int[(int)1e7];
        arrMod[0] = 7 % k;

        for (int i=1; i<arrMod.length; i++) {
            int tmpM = arrMod[i-1] * 10 + 7;
            tmpM %= k;
            arrMod[i] = tmpM;
        }

        int res = 1;
        for (int i=0; i<arrMod.length; i++) {
            if (arrMod[i]==0) break;
            res++;
        }


        if (res==10000001) {
            System.out.println(-1);
        } else {
            System.out.println(res);
        }

    }

}

