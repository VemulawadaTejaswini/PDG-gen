import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int c = sc.nextInt();
      	int d = a + b + c;
      	switch (d){
          case 0:
			System.out.println(0);
      		break;
          case 1:
			System.out.println(1);
      		break;
          case 2:
			System.out.println(2);
      		break;
        }
	}
}
