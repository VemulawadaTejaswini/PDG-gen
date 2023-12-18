import java.util.*;
import java.util.Calendar;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力値を変数に代入
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
        int d = sc.nextInt();
      	System.out.println(a + b + c + d);
		// 文字列の入力
      　Calendar calendar = Calendar.getInstance();
        calendar.set(2019, a, b);
        int day = calendar.getActualMaximum(Calendar.DATE);
        if(day = b){
          	// 出力
        	System.out.println("1");
        }
      	else{
        	// 出力
        	System.out.println("0");
        }
	}
}