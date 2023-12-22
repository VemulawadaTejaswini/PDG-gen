import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();  // 花札の枚数
            int r = sc.nextInt();  // 交換回数
            if (n == 0 && r == 0) {
                break;
            }
            ArrayList<Integer> hanahuda = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                hanahuda.add(i + 1);
            }
            for (int i = 0; i < r; i++) {
                int p_ = n - sc.nextInt(); // 花札の交換する部分の一番上（1～）
                int c = sc.nextInt(); // 交換する枚数

                ArrayList<Integer> buf = new ArrayList<Integer>();
                for (int j = 0; j < p_ - c + 1; j++) {
                    buf.add(hanahuda.get(j));
                }
                for (int j = p_ + 1; j < n; j++) {
                    buf.add(hanahuda.get(j));
                }
                for (int j = p_ - c + 1; j <= p_; j++) {
                    buf.add(hanahuda.get(j));
                }
                hanahuda = buf;
            }
            System.out.println(hanahuda.get(hanahuda.size() - 1));
        }
        sc.close();
    }
}

