import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();
        String[][] pos = new String[N][2];
        for (int i=0; i<N; i++) {
            pos[i][0] = String.valueOf(S.charAt(i));
            pos[i][1] = "1";
        }
        String[][] method = new String[Q][2];
        for (int i=0; i<Q; i++) {
            method[i][0] = sc.next();
            method[i][1] = sc.next();
        }
        for (int i=0; i<Q; i++) {
            for (int j=0; j<pos.length; j++) {
                if (pos[j][0].equals(method[i][0])) {
                    if ("L".equals(method[i][1])) {
                        if (j > 0) {
                            pos[j-1][1] = String.valueOf(Integer.valueOf(pos[j-1][1]) + Integer.valueOf(pos[j][1]));
                        }
                    } else {
                        if (j < pos.length - 1){
                            pos[j+1][1] = String.valueOf(Integer.valueOf(pos[j+1][1]) + Integer.valueOf(pos[j][1]));
                        }
                    }
                    pos[j][1] = "0";
                }
            }
        }
        int cnt = 0;
        for (int i=0; i<pos.length; i++) {
            if (Integer.valueOf(pos[i][1]) > 0) {
                cnt += Integer.valueOf(pos[i][1]);
            }
        }

        System.out.println(cnt);
    }
}
