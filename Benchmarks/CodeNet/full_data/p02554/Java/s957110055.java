import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		if(a > 10) System.out.println(0);
		System.out.println((int) (Math.pow(10,a) 
                                  - (2* Math.pow(9,a) - 
                                     Math.pow(8,a))
                                 )
                          );
	}
}