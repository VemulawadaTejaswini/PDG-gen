import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		// 文字列の長さ
		int len = n%2 == 0 ? n/2 : 0;
		boolean ret = true;
		if(len>0) {
			String e = s.substring(0,len-1);
			for(int i=len-1; i<s.length();) {
				if(!e.equals(s.substring(i,i+(len-1)))){
					break;
				}
				i+=len;
			}
		}else {
			ret = false;
		}
		System.out.println(ret?"Yes":"No");
		sc.close();
	}
}
