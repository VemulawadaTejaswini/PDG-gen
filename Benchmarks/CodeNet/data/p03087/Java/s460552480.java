import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String moji_data = sc.next();
		
		for(int i=0;i<q;i++) {
			String moji = moji_data.substring(sc.nextInt()-1,sc.nextInt());
			System.out.println((moji.length()-moji.replace("AC", "").length())/"AC".length());
		}
	}
}