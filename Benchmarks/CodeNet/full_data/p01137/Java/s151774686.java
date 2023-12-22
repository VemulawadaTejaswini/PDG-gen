import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        // 名前取得
        Scanner sc = new Scanner(System.in);
        // Input取得
        do {
            int e = sc.nextInt();
            if (e == 0) {
                break;
            }
            int m = e;
            int ans = 0;

            int x = 0;
            for (int z = 0; z * z * z < e + 1; z++) {
                for (int y = 0; y < Math.sqrt(e) + 1; y++) {
                    x = e - ((y * y) + (z * z * z));
                    if (x < 0) {
                        break;
                    }
                    int temp_m = x + y + z;
                    m = Math.min(temp_m, m);
                }
            }




            System.out.println(m);

        } while (true);
    }
}
