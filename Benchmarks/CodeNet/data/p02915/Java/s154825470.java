import java.util.*;
 
class Main {
 
    public static void main(String[] args) {
        
		//入力値取得
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
　　　　
　　　　//入力値が1以上　かつ　入力値が9以下である場合
        if (i >= 1 && i <= 9) {
            System.out.println(i * i * i);
        }
    }
}