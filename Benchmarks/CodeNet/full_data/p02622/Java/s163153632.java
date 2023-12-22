import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 文字列の入力
		String s1 = sc.next();
		String s2 = sc.next();
      int counter =  s1.length();
		for(int i = 0; i < s1.length() ; i++){
			if(s1.substring( i, i + 1).equals (s2.substring(i, i + 1))){
				counter -= 1;
			}	
		}
		// 出力
		System.out.println(counter);
	}
}