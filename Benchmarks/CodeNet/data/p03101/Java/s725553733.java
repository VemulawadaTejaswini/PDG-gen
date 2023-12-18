import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // スペース区切りの整数の入力(HとW)
        int H = sc.nextInt();
        int W = sc.nextInt();
        // スペース区切りの整数の入力(hとw)
        int h = sc.nextInt();
        int w = sc.nextInt();
        // 出力
        System.out.println((H-h)*(W-w));
    }
}