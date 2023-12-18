import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

		// 整数の入力
		int count = sc.nextInt();

		// 文字列の入力
        String str = sc.next();
        String str2 = sc.next();
        for (int i = 0; i < count; i++) {
            System.out.print(str.charAt(i));
            System.out.print(str2.charAt(i));
        }
	}
}