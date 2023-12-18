import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int q = sc.nextInt();
		String str = sc.next();
		int count =0;
		int flag=0;
		int s=0;
		int l=0;//hazimeno文字がAならflag==1
		char check=' ';
		String subStr="";
		String search="AC";
		for(int k =0;k<q;k++) {
			 s = sc.nextInt();
			 l = sc.nextInt();
			  subStr = str.substring(s-1,l);
			  count=( subStr.length()-subStr.replaceAll(search, "").length())/search.length();
			  System.out.println(count);
			  count=0;
		}

	}
}