import java.util.Scanner;

class Main{
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		sc.close();
		String T = "";
		String[] str = { "eraser","erase", "dreamer","dream"};
		
		for(int i = 0; i < 4; i++) {
			String restr = str[i];
			StringBuffer dest = new StringBuffer(restr);
			str[i] = dest.reverse().toString();
			System.out.println(str[i]);
		}
	
		for(int i = 0; i < 4; i++) {
			StringBuffer dest = new StringBuffer(S);
			S = dest.reverse().toString();
			S = S.replace(str[i], "@");
		}
		System.out.println(S);
		String[] s = S.split("");
		
		for(int i = 0; i < s.length; i++) {
			if( !s[i].equals("@")) {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
	}
}