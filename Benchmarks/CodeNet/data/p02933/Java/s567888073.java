import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// 文字列の入力
		String s = sc.next();
      	String out = "";
		// 出力
      	if(a<3200){
        	out = "red";
        }else{
          	out = s;
        }
		System.out.println(a+"\n"+out);
	}
}