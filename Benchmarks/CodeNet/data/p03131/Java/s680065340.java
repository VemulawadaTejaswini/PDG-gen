import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[] in = getLine().split(" ");
        int restCount = toInt(in[0]);
        long biscket = 1;
        long a = toLong(in[1]); // a枚で一円と交換
        long b = toLong(in[2]); // 1円でb枚と交換

        while(biscket != a && restCount != 0) {
            restCount--;
            biscket++;
        }

        if(restCount == 0) {
            print("" + biscket);
            return;
        }

        // 偶数回になるように調整
        if(restCount % 2 == 1) {
            biscket++;
            restCount--;
        }

        if(restCount == 0) {
            print("" + biscket);
            return;
        }

        // 交換が非効率の場合
        if(b - a <= 2) {
            biscket += restCount;
            print("" + biscket);
            return;
        } else {
            long changeBiscket = (b - a) * restCount / 2;
            biscket += changeBiscket;
//            print(String.format("%d %d %d %d", a, b, restCount, changeBiscket));
            print("" + biscket);
            return;
        }
    }

    public static int getInt() {
        return scan.nextInt();
    }

    public static String getLine() {
        return scan.nextLine();
    }

    public static int toInt(String str) {
        return Integer.parseInt(str);
    }

    public static long toLong(String str) {
        return Long.parseLong(str);
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
