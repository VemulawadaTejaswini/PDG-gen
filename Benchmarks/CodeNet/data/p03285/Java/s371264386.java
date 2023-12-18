import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		int c = 4;
		int d = 7;
		int flag = 0;
		if(n%4==0){flag=1;};
		if(n%7==0){flag=1;};
		if(n%11==0){flag=1;};
		if(n%18==0){flag=1;};
		if(n%29==0){flag=1;};
		// 文字列の入力
		//String s = sc.next();
		// 出力
		if(flag==1)System.out.println("Yes");
		else System.out.println("No");
	}
}