import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        String S = sc.nextLine();
        String tmp;
        if(S.length > K) {
            for(int i = 0; i < K; i++) {
                tmp[i] = S[i];
            }
            tmp[K] = "...";
        } else {
            tmp = S;
        }
        System.out.println(tmp);
    }
}