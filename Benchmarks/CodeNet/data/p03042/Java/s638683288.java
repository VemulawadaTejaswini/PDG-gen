import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int yy = a / 100;
        int mm = a % 100;
        int ans = 0;
        boolean yyyy = false;
        if (0 < yy && yy < 13) {
            ans++;
            yyyy = true;

        }
        if (0 < mm && mm < 13) {
            ans++;
        }
        String mes = "NA";
        if (ans == 2) {
            mes = "AMBIGUOUS";
        } else if (ans == 1) {
            if (!yyyy) {
                mes = "YYMM";
            } else {
                mes = "MMYY";
            }
        }
        System.out.println(mes);
        sc.close();
    }
}