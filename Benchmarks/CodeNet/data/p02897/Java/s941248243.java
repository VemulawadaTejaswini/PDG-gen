import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
        int num = (n/2)+(n%2);
        double par = num/(double)n;
		// 出力
		System.out.println((double)par);
	}
}