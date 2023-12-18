import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();

        StringBuilder str = new StringBuilder();
        for (int i=0; i<N; i++) {
            if ((i+1) == K) {
                str.append(S.substring(i,i+1).toLowerCase());
            }
            else {
                str.append(S.substring(i,i+1));
            }
        }

        System.out.println(str.toString());
    }
}