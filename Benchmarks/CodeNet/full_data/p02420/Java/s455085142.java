import java.util.Scanner;

public class M {

	static char[] AB= {'a','b','c','d','e','f','g'
			,'h','i','j','k','l','m','n'
			,'o','p','q','r','s','t','u'
			,'v','w','x','y','z'};
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);

		
		while(true) {
			String W = sc.next();
			if(W.equals("-")) {
				break;
			}
			int a=sc.nextInt();
			for(int i=0;i<a;i++) {
				int s=sc.nextInt();
				String sa=W.substring(0, s);
				String sz=W.substring(s);
				W=sz+sa;
			}
			System.out.println(W);
		}
		
		
				sc.close();
	}

}
