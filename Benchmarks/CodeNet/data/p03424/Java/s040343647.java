//11942

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        HashMap<String, Integer> HM = new HashMap();
        int N = Input.nextInt();
        for (int I = 0; I < N; I++) {
            String S = Input.next();
            HM.put(S, 0);
        }
        if (HM.size() == 4) {
            System.out.println("Four");
        } else if (HM.size() == 3) {
            System.out.println("Three");}
    }
}
