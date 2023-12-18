import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String answer ="IMPOSSIBLE";
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int s =0;
      if((a+b)%2 == 0){
        System.out.println((a+b)/2);
        }else{
        System.out.println(answer);
      }
        
		
        
		
	}
}
