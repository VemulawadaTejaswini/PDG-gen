
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        // ?????????????§???????
        while(true) {
        int n = Integer.parseInt(GetSubStringLine()[0]);
        if (n == 0) {
            break;
        }
        String[] s = GetSubStringLine();
        int[] a = new int[26];
        boolean flag1 = false;
        for (int i=0;i<s.length;i++) {
            int in = s[i].charAt(0)-'A';
            a[in]++;
            boolean flag = false;
            for (int j=0;j<a.length;j++) {
                if (j!=in) {
                    if (a[in] <= a[j] + s.length-i-1) {
                        flag = true;
                        break;
                    }
                }
            }
            if (!flag) {
                System.out.println(s[i].charAt(0) + " "+(i+1));
                flag1 = true;
                break;
            }
        }
        if (!flag1) {
            System.out.println("TIE");
        }
        }
    }

    public static String[] GetSubStringLine() {
        String s = sc.nextLine();
        return s.split(" ");
    }
}