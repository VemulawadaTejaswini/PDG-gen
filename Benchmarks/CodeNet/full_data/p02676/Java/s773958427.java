import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc=new Scanner(System.in);

		int k=sc.nextInt();
		String s=sc.next();
		//int n=s.length();
		String komos=s.toLowerCase ();

		if(s.length()>=1&&s.length()<=100) {
			if(k>=1&&k<=100) {
				if(s.length()<=k) {
					System.out.println(komos);
				}else {
					System.out.println(komos.substring(0,k)+"…");
				}
			}
		}
		sc.close();
	}
}
