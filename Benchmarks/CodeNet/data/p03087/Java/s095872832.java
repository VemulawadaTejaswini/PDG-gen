import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();

        for (int i=0; i<Q; i++) {
            int li = sc.nextInt() -1;
            int ri = sc.nextInt() ;

            String wk = S.substring(li, ri);
            int cnt = 0;
            int idx = 0;
            while (true) {
                int ret = wk.indexOf("AC", idx);
                if (ret == -1) {
                    break;
                }
                cnt++;
                idx += 2;
            }
            System.out.println(cnt);

            
        }
    }

}