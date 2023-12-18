import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String anc = String.valueOf(str.charAt(0));
		int cnt = 0;
		int a = sc.nextInt();
		for(int i = 1;i < str.length();i++) {
			cnt++;
			if(cnt == a) {
				anc = anc + String.valueOf(str.charAt(i));
				cnt = 0;
			}
		}
		System.out.println(anc);
	}
}