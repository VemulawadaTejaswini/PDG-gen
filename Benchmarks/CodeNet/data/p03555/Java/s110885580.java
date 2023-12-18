import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		char ch1[];
		char ch2[];
		String str1 = sc.next();
		ch1=str1.toCharArray();

		String str2 = sc.next();
		ch2=str2.toCharArray();
		// 出力

		for(int i=0;i<ch1.length;i++){
			if(ch1[i]!=ch2[ch2.length-i-1]) {
				System.out.println("NO");
				System.exit(0);
			}
		}
		System.out.println("YES");
	}

}
