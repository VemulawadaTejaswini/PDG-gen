import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		char[] s = sc.next().toCharArray();
		int cnt = 0;

		for(int i = 0; i < s.length; i++){
			if(s[i] == 'A' || s[i] == 'C' || s[i] == 'G' || s[i] == 'T'){
				cnt++;
			}else{
				if(cnt > 0){
					break;
				}
			}
		}

		System.out.println(cnt);

		sc.close();
	}
}
