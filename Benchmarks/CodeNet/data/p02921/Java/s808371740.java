import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc =new Scanner(System.in);

		String s=sc.next();
		String t=sc.next();
		
		char[] ss=s.toCharArray();
		char[] tt=t.toCharArray();
		
		int ans =0;
		
		for(int i=0;i<3;i++) {
			if(ss[i]==tt[i])ans++;
		}
		
		System.out.println(ans);
		





	}


}


