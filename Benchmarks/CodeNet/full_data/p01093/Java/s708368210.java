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
        int[] a = new int[1000];
        int min = 1000000;
        for (int i=0;i<n;i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        for (int i=0;i<n-1;i++) {
            for (int j=i+1;j<n;j++) {
                if (Math.abs(a[i]-a[j]) < min) {
                    min = Math.abs(a[i]-a[j];
                }
            }
        }
        System.out.println(min);
        }
    }

    public static String[] GetSubStringLine() {
        String s = sc.nextLine();
        return s.split(" ");
    }
}