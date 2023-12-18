import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 整数の入力
        //x = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int max = 100003;
        int[] sosu = new int[max];
        //1～10000
        for (int i = 0; i < max; i++) {
            sosu[i] = i+1;
        }
        //1を消す
        sosu[0] = 0;
        //エラトステネス
        for (int i = 1; i < Math.floor(Math.sqrt(max)); i++) {
            //小さい数探し
            int j = 0;
            for (j = 1; j < Math.floor(Math.sqrt(max)); j++) {
                if (sosu[j - 1] != 0 && !list.contains(j)) {
                    list.add(j);
                    break;
                }
            }
            //消す
            for (int k = j+1; k < max; k++) {
                if (sosu[k - 1] % j == 0) {
                    sosu[k - 1] = 0;
                }
            }
        }
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        for (int i = x-1; i < sosu.length; i++) {
            if (sosu[i] != 0) {
                System.out.println(sosu[i]);
                break;
            }
        }
	}
}