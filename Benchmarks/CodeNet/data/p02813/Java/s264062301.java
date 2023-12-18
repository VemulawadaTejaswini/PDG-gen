import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];
        for (int i=0 ;i<n; i++) p[i] = sc.nextInt();
        for (int i=0; i<n; i++) q[i] = sc.nextInt();

        int[] cntP = new int[n];
        int[] cntQ = new int[n];

        cntP[0] = p[0]-1;
        cntQ[0] = q[0]-1;

        for (int i=1; i<n; i++){
            int tmp = p[i];
            int tmp2 = q[i];
            int cnt = 0;
            int cnt2 = 0;
            for (int j=0; j<i; j++){
                if (p[j]<tmp) cnt++;
            }
            for (int j=0; j<i; j++){
                if (q[j]<tmp2) cnt2++;
            }
            cntP[i] = tmp-1-cnt;
            cntQ[i] = tmp2-1-cnt2;

        }


        StringBuilder s = new StringBuilder();
        StringBuilder t = new StringBuilder();

        for (int i=0; i<n; i++) s.append(p[i]);
        for (int i=0; i<n; i++) t.append(q[i]);


        int left = Integer.parseInt(s.toString());
        int right = Integer.parseInt(t.toString());

        int start;
        int end;

        s = new StringBuilder();
        t = new StringBuilder();

        for (int i=0; i<n; i++) s.append(i+1);
        for (int i=n; i>=1; i--) t.append(i);

        start = Integer.parseInt(s.toString());
        end = Integer.parseInt(t.toString());

        int cntLeft = 0;
        int cntRight = 0;



        int[] fact = {40320, 5040, 720, 120, 24, 6, 2, 1};

        for (int i=0; i<n-1; i++){
            cntLeft += cntP[i]*fact[9-n+i];
            cntRight += cntQ[i]*fact[9-n+i];
//            int tmp = left/(int)Math.pow(10, i+1);
//            int tmp2 = right/(int)Math.pow(10, i+1);
//            tmp %= 10;
//            tmp2 %= 10;
//            cntLeft += (tmp-1)*fact[i];
//            cntRight += (tmp2-1)*fact[i];
        }

        System.out.println(Math.abs(cntLeft-cntRight));




    }
}