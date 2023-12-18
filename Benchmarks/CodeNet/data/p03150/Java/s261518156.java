import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String e ="keyence";
		int y = 0;
		char[] c = new char[a.length()];
		char[] g = new char[7];
		for(int i = 0; i < a.length(); i++){
			c[i]=a.charAt(i);
		}
		for(int i = 0; i < 7; i++){
			g[i]=e.charAt(i);
		}
		for(char i: g){
			for(int j = y; j < a.length(); j++){
				y++;
				if(i==c[j]){
					break;
				}
				if(j==a.length()-1){
					System.out.println("NO");
					return;
				}
			}
		}
		System.out.println("YES");
	}
}