import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String s = sc.nextLine();
			String p = sc.nextLine();
			boolean yes = false;
			for(int i = 0;i<s.length();i++) {
				int j;
				for(j=0;j<p.length();j++) {
					if(s.charAt((i+j)%s.length())!=p.charAt(j)) break;
				}
				if(j==p.length()) {
					yes = true;
					break;
				}
			}
			System.out.println(yes?"Yes":"No");
		}
	}
}
