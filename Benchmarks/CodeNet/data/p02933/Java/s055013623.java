import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int a = sc.nextInt();
		String s = sc.next();

		// 出力
		if(a >= 3200){
		  System.out.println(s);  
		}else{
		    System.out.println("red");
		}
	}

}
