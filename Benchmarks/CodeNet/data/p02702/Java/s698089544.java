import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char[] s = scan.next().toCharArray();
		scan.close();
		 
		int[] digit = new int[s.length];
		int[] remainder = new int[s.length];//i桁までの数字を2019で割った余りは何かを保存する
		int[] num = new int[2019];//余りがiである数字の数
		int[] ppp = new int[s.length];
		num[0]++;
		for(int i = 0; i < digit.length; i++) {
			digit[i] = s[digit.length-1-i] - '0';//charをintに変換
			
			if(i == 0) {
				ppp[i] = 1;
				remainder[i] = digit[i] % 2019;
			}else {
				ppp[i] = 10*ppp[i-1] % 2019;
				remainder[i] = (ppp[i]*digit[i]+remainder[i-1]) % 2019;
			}
			
			num[remainder[i]]++;
		}
		
		int ans = 0;
		for(int i = 0; i < 2019; i++)
			ans += num[i]*(num[i]-1)/2;
		
		System.out.println(ans);
	}
}
