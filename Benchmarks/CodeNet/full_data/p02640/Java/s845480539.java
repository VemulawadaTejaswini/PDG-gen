import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		boolean ans=false;
      for(int i=1; i<a; i++){
      if((2*i)+(4*(a-i))==b)ans=true;
      }
      if(ans){
      System.out.println("Yes");
      }else{
      System.out.println("No");
      }
	}
}