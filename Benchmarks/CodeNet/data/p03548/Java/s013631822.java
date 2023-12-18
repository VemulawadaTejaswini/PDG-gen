import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

                int n = 0;
                if (x > (y + z)) {
                   n = (x - z) / ( y + z);
                }
                
		// 出力
		System.out.println(String.valueOf(n));
	}
}