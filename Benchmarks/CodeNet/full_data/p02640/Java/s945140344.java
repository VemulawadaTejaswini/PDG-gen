import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		// 整数の入力
        
        int num = sc.nextInt();
        
        int leg = sc.nextInt();
        
        for(int i = 0;i < num + 1;i++){
            if((i*2 + (num-i)*4) == leg) {
                System.out.println("Yes");
                System.exit(0);
            }
        }
		// 出力
		System.out.println("No");

    }
}