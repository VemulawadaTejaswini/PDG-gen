import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// 文字列の入力
		String s = sc.next();
		// 出力
      		if ( n % 2 == 0 ) {
              if( s.substring(n/2).equals(s.substring(0,n/2-1)) ) {
				System.out.println("Yes");
	      	  }else {
				System.out.println("No");
              }
            }else {
				System.out.println("No");
		    }
	}
}
