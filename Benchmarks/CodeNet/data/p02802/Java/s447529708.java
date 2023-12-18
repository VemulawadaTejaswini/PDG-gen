import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int[] P = new int[M];
        String[] S = new String[M];
        int right = 0;
        int num = 0;
        int wrong = 0;

        for (int i = 0; i < M; i++) {
            int tem = s.nextInt();
            P[i] = tem;
            String tem2 = s.next();
            S[i] = tem2;
                if (tem2.equals("AC")) {
                    right = right + 1;

                } else if (tem2.equals("WA")){
                    wrong = wrong + 1;
                }


        }
        System.out.println(right + " " + wrong);

    }
}


