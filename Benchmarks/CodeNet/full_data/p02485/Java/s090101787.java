import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int sum=0;
			String s=sc.next();
			if(s.equals("0"))break;
			for(int i=0;i<s.length();i++) {
				char keta=s.charAt(i);
				sum+=keta-'0';
			}
			System.out.println(sum);
		}
	}
}