import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		String a = sc.next();
       	// int型にキャスト
      	int b = Integer.parseInt(a.subStiring(0,1));
      	int c = Integer.parseInt(a.subStiring(1,2));
      	int d = Integer.parseInt(a.subStiring(2,3));
      	int e = b + c + d;
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
