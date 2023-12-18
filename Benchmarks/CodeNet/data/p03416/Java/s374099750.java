//11942

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int Count = 0;
        int A = Input.nextInt();
        int B = Input.nextInt();

        for (int I = A; I <= B; I++) {
            String S = I + "";
            if (S.subSequence(0, 2).equals(S.subSequence(3, 5))) {
            Count++;}
        }
        System.out.println(Count);
    }
}
