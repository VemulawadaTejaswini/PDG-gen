import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int cnt = 0;
		if(s.length()==1){
			cnt = 1;
		}
		for(int i = 0; i < s.length()-1;){
			if(i != s.length()-2){

			if(s.charAt(i)==s.charAt(i+1)){
				i += 3;
				cnt += 2;
				if(i == s.length()-1){
					cnt++;
				}
			}
			else{
				i ++;
				cnt ++;
			}

			}
			else{
				if(s.charAt(i)==s.charAt(i+1)){
					i ++;
					cnt ++;
				}
				else{
					i ++;
					cnt += 2;
				}
			}
		}

		System.out.println(cnt);
	}
}