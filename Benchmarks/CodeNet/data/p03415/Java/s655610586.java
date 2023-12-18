import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 文字列の入力
		String[] s1 = sc.next().split("");
        String[] s2 = sc.next().split("");
        String[] s3 = sc.next().split("");
    
		// 出力
		System.out.println(s1[0] + s2[1] + s3[2]);
	}
}
