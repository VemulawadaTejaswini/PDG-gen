import java.util.Scanner;

class Abc059c {
    static public void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        int a[] = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
        }

        int nowPN = 0;
        int curPN = 0;

        nowPN = sign(a[0]);
        
        int sum = a[0];
        int op = 0;
        int totalop = 0;

        for (int i = 1; i < num; i++) {
            sum = sum + a[i];
            nowPN = -nowPN;
            curPN = sign(sum);
            System.out.println("nowPN: " + nowPN + " / curPN: " + curPN);
            System.out.println("a[" + i + "]= " + a[i] + " / sum = " + sum);
            if (curPN != nowPN) {
                if (nowPN == 1) { // ++++
                    op = 1 - sum;
                    sum = sum + op;
                } if (nowPN == -1) { // ----
                    op = sum + 1;
                    sum = sum - op;
                }
                totalop += op;
                System.out.println("  op: " + op + " / newsum: " + sum);     
            }
        }

        System.out.println(totalop);
    }

    static public int sign(int a) {
        if (a == 0) {
            return 0;
        } else if (a > 0) {
            return 1;
        } else if (a < 0) {
            return -1;
        }
        return 0;
    }
}
