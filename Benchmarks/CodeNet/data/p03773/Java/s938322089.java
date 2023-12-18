import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
int ans;
                if(a+b<24){
ans=a+b-24;
}else{
ans=a+b;
}
		System.out.println(ans);
	}
}
