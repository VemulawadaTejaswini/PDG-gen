import java.util.*;
import java.math.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 入力
	int a = sc.nextInt();
	double res = 0.0;
    
    for(int i=1;i<=a;i++) {
        if(i%5 == 0 || i%3 == 0) {
            continue;
        } else {
            res += (double)i;
        }
    }
	// 出力
    System.out.print(BigDecimal.valueOf(res).toPlainString());
	}
}
