import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			String s=sc.next();
			int ans=0;
			if(s.equals("0")) {
				System.exit(0);
			}
			for(int i=0; i<s.length(); i++) {
				ans+=s.charAt(i)-'0';
			}
			System.out.println(ans);
		}

	}
}
