import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        for(int i=0;i<W;i++){
            for(int j=0;j<H;j++) {
                if ((i < A && j < B) || (i >= A && j >= B)){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
//        System.out.println((a + b + c) + " " + s);
    }

}