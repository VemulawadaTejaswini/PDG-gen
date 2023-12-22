import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        // ?????????????§???????
        String[] a;
        while(true) {
            a = GetSubStringLine();
            int m = Integer.parseInt(a[0]);
            int n = Integer.parseInt(a[1]);
            if (m == 0 && n == 0) {
                break;
            }
            int[] aaa = new int[n];
            int ma = m;
            int cnt = 0;
            int nn;
            while(cnt < n) {
                boolean flag = false;
                int i;
                for (i=0;i<cnt;i++) {
                    nn = aaa[i];
                    if (nn==0) {
                        break;
                    }
                    if (ma % nn == 0) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    aaa[i] = ma;
                    cnt++;
                }
                ma++;
            }
            ma=aaa[cnt-1];
            while(true) {
                boolean flag = false;
                for (int i=0;i<cnt;i++) {
                    nn = aaa[i];
                    if (ma % nn == 0) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    System.out.println(ma);
                    break;
                }
                ma++;
            }
        }
    }

    public static String[] GetSubStringLine() {
        String s = sc.nextLine();
        return s.split(" ");
    }
}