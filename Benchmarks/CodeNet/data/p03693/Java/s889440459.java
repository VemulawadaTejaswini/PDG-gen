import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
      	int c = sc.nextInt();
		int flag = 0;
      if((100*a+10*b+c)%4==0){
        flag = 1;
      }
		// 出力
      if(flag==0){
		System.out.println("No");
	}else{
        System.out.println("Yes");
      }
      }
}