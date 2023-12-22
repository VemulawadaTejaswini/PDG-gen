import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		//????????????????????????
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String p = sc.nextLine();
		String ans = "No";

		//vanceknowledgetoad
		//advance
		for (int i = 0; i < s.length(); i++) {
			String str = s.substring(i, i + p.length());

			if(p.equals(str)){
				ans = "Yes";
				break;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}