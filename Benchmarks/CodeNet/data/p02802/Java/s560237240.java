import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(m == 0) {
            System.out.println("0 0");
            return;
        }
        String[][] p = new String[m][2];
        for(int i=0; i<m; i++) {
            p[i][0] = sc.next();
            p[i][1] = sc.next();
        }
        boolean[] ac = new boolean[n+1];
        int [] wa = new int[n+1];
        int a = Integer.parseInt(p[0][0]);
        int waa = 0;
        for(int i=0; i<m; i++) {
            if(a != Integer.parseInt(p[i][0])) {
                if(ac[a] == false) {
                    wa[a] = 0;
                }else {
                    wa[a] += waa;
                }
                waa = 0;
            }
            a = Integer.parseInt(p[i][0]);
            if("AC".equals(p[i][1])) {
                ac[a] = true;
            } else if("WA".equals(p[i][1])) {
                if(ac[a] == false) {
                    waa++;
                }
            }
            if(i == m-1) {
                if(ac[a] == false) {
                    wa[a] = 0;
                }else {
                    wa[a] += waa;
                }
            }
        }
        int acC = 0;
        int waC = 0;
        for(int i=1; i<=n; i++) {
            if(ac[i] == true) acC++;
            waC += wa[i];
        }
        System.out.println(acC + " " + waC);
    }
}
