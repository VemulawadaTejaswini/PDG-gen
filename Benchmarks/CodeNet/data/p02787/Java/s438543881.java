import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int n = sc.nextInt();
        int[][] ab = new int[n][2];

        for (int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            ab[i][0] = a;
            ab[i][1] = b;
        }

        int idx = 0;

        int ans = 0;

        double base = (double)ab[0][0]/(double)ab[0][1];

        for (int i=1; i<n; i++){
            if (base<(double)ab[i][0]/(double)ab[i][1]){
                idx = i;
                base = (double)ab[i][0]/(double)ab[i][1];
            }
        }

        while (h>0){
            ans += ab[idx][1];
            h -= ab[idx][0];
        }


        int tmp = ans;
        int min = ab[idx][1];
        tmp -= ab[idx][1];
        h += ab[idx][0];
        for (int i=0; i<n; i++){
            if (h-ab[i][0]<0 && tmp+ab[i][1]<ans){
                min = Math.min(min, ab[i][1]);
            }
        }
        System.out.println(tmp+min);

//        System.out.println(idx);


//        double[] parf = new double[n];
//        for (int i=0; i<n; i++){
//            parf[i] = (double)ab[i][0]/(double)ab[i][1];
//        }
//        Arrays.sort(parf);
//
//        System.out.println(parf[2]);

    }
}




