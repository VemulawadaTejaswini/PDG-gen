import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 文字列の入力
        String[] s1 = sc.next().split("");
        String[] s2 = sc.next().split("");
        String[] s3 = sc.next().split("");
        
		String s1First = s1[0].toUpperCase();
        String s2First = s2[0].toUpperCase();
        String s3First = s3[0].toUpperCase();
    
		// 出力
		System.out.println(s1First + s2First + s3First);
	}
}
