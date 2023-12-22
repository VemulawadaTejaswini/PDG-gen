import java.util.Scanner;
public class Main{
	public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
	for(;;) {
		String i=scan.next();
		if(i.equals("0")) {
			break;
		}
		int a=0;
		for(int j=0;j<i.length();j++) {
			char ch=(i.charAt(j));
			String str=""+ch;
			a+=Integer.valueOf(str);
		}
		System.out.println(a);
	}
	}
}
