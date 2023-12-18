import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int headB = 0;
        int tailA = 0;
        int headBandtailA = 0;
        int ABcount = 0;
        String[] S = new String[N];

        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
        }

        for (int i = 0; i < N; i++) {
            String s = S[i];
            if (s.startsWith("B")) {
                if (s.endsWith("A")) {
                    headBandtailA++;
                } else {
                    headB++;
                }
            } else if (s.endsWith("A")) {
                tailA++;
            }

            int index = 0;
            while (index != -1) {
                index = s.indexOf("AB");
                if (index != -1) {
                    ABcount++;
                    if(s.length() >= index+2){
                        s = s.substring(index+2);
                    } else {
                        index = -1;
                    }
                }
            }
        }

        if (headB == 0 && tailA == 0) {
            if(headBandtailA > 0){
                System.out.println(ABcount + headBandtailA -1);
            } else {
                System.out.println(ABcount);
            }

        } else {
            System.out.println(ABcount + headBandtailA + Math.min(headB,tailA));
        }
    }
}
