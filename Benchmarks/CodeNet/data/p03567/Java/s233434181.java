import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String S=sc.next();
		char c[]=S.toCharArray();
		int d=c.length;
		boolean isAC=false;
		for(int i=0;i<d-1;i++) {
			if(c[i]=='A'&&c[i+1]=='C') {
				isAC=true;
				break;
			}
		}
		if(isAC) System.out.println("Yes");
		else System.out.println("No");
		
	}
}
