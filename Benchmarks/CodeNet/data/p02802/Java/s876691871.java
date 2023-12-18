import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        String AC = "ac";
        String WA = "wa";
        int[] P = new int[M];
        String[] S = new String[M];
        int right = 0;
        int temp = 0;
        int wrong = 0;

        for (int i = 0; i < M; i++) {
            int tem = s.nextInt();
            P[i] = tem;
            String tem2 = s.next();
            S[i] = tem2;

                if (tem2.equals(AC) && tem != temp) {
                    right = right + 1;
                    temp = tem;

                } else if (tem2.equals(WA) && tem != temp){
                    wrong = wrong + 1;
                }


        }
        System.out.println(right + " " + wrong);

    }
}

