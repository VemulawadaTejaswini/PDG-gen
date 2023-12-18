import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	String str=scan.next();
	boolean fig=true;
	for(int i=0;i!=a+b+1;i++) {
		char ch=str.charAt(i);
		if(i==a) {
			if(ch=='-') {
			}
			else {
				fig=false;
			}
		}
		else {
			if(ch=='-') {
				fig=false;
			}
		}
	}
	System.out.println(fig?"Yes":"No");
	scan.close();
}
}