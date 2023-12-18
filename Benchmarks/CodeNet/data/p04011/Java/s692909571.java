import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 宿泊日数と制限
        int n = sc.nextInt();
        int k = sc.nextInt();
        // 値段
        int x = sc.nextInt();
        int y = sc.nextInt();
        // 値段保持
        int z = 0;
        // 回数保持
        int ii = 1;

        for ( int i = 1; k >= i; i++ ) {
            z = z + x;
            ii++;
        }

        for ( int i = ii; n >= i; i++) {
            z = z + y;
        }
        // 出力
        System.out.println(z);
    }
}