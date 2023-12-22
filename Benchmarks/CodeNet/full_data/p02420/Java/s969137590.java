import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str=scan.next();
		int m = scan.nextInt();
		int len = 0;
		int point =0;
		String a ="";
		String b ="";
		while(!str.equals("-")){
			len =str.length();
			for(int i=0;i<m;i++){
				point = scan.nextInt();
				a=str.substring(0,point++);
				b=str.substring(point-1);
				str=b+a;
			}
			str=scan.next();
			m = scan.nextInt();
		}
	}

}