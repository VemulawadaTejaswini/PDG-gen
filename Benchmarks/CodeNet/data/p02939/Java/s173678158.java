import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = sc.next().toCharArray();
		sc.close();
		int cnt1 = 0;
		for(int i = 0;i < ch.length-1;i++){
			if(ch[i]==ch[i+1]){
				i++;
			}
			cnt1++;
		}
		int cnt2 = 0;
		for(int i = ch.length-1;i > 0;i--){
			if(ch[i]==ch[i-1]){
				i--;
			}
			cnt2++;
		}
		System.out.println(Math.max(cnt1+1, cnt2+1));
	}
}