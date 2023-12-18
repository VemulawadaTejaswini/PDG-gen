import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 0;
        for (int i = 357; i <= n; i++) {
            boolean _is3 = false;
            boolean _is5 = false;
            boolean _is7 = false;

            int v = i;
            while (v >= 1) {
                int z = v % 10;
                if (z == 3)         _is3 = true;
                else if (z == 5)    _is5 = true;
                else if (z == 7)    _is7 = true;
                else {
                    _is3 = false;
                    break;
                }
                v /= 10;
            }
            if (_is3 && _is5 && _is7)
                cnt++;
        }

        System.out.println(cnt);
    }
}
