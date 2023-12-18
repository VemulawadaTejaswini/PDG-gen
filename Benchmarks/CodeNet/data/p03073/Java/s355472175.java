import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] N = S.split("");
        int cnt = 0;
        for (int i=0; i<N.length; i++) {
            if (i > 0 && N[i-1].equals(N[i])) {
                if (N[i-1].equals("0"))
                    N[i] = "1";
                else
                    N[i] = "0";
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
