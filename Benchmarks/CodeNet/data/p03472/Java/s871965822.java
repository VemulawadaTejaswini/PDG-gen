import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int hitpoint = sc.nextInt();

        int[][] katana = new int[n][3];

        for (int i = 0; i < n; i++) {
            katana[i][0] = i;
            katana[i][1] = sc.nextInt();
            katana[i][2] = sc.nextInt();
        }

        // aの強い順に並び替える
        Arrays.sort(katana, (o1, o2) -> o2[1] - o1[1]);

        int[] aMaxKatana = katana[0].clone();

        // bの強い順に並び替える
        Arrays.sort(katana, (o1, o2) -> o2[2] - o1[2]);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (aMaxKatana[1] < katana[i][2]) {
                // katana[i]を投げる
                hitpoint -= katana[i][2];
                // katana[i]使用不可
                count++;
            }
        }

        if (0 <= hitpoint) {
            count += hitpoint/aMaxKatana[1];
            int residue = hitpoint % aMaxKatana[1];
            // 余りを減らす一発
            if (residue != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
