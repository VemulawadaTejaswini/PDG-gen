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
        String tmp = "";
        int countW = 0;
        int countA = 0;
        boolean A = false;
        for(int i=0; i<m; i++) {
            if(tmp.equals(p[i][0])) {
                if("AC".equals(p[i][1])) {
                    if(A == false) {
                        countA++;
                        A = true;
                    }
                } else if("WA".equals(p[i][1])) {
                    if(A == false) {
                        countW++;
                    }
                }
            } else {
                tmp = p[i][0];
                A = false;
                if("AC".equals(p[i][1])) {
                    countA++;
                    A = true;
                } else if("WA".equals(p[i][1])) {
                    countW++;
                }

            }
        }
        System.out.println(countA + " " + countW);
    }
}