import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String S = sc.next();
		// スペース区切りの整数の入力		
        String ans = "answer";
      if(S=="Sunny"){
        ans = "Cloudy";
      }else if(S=="Cloudy"){
        ans = "Rainy";
      }else{
        ans = "Sunny";
      }
       // 出力
		System.out.println(ans);
	}
}