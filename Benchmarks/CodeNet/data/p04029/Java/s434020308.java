import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		// スペース区切りの整数の入力
		int sum=0;
for(int i=1;i<=N;i++){
	sum=sum+i;
}
		// 出力
		System.out.println(sum);
	}
}