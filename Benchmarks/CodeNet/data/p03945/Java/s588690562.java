import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		String string = sc.next();
		int ans = 0;
		char p = string.charAt(0);
		for(int i = 1;i < string.length();i++){
			if(p != string.charAt(i)){
				ans++;
				p = string.charAt(i);
			}
		}
		System.out.println(ans);
		
				
	}
}