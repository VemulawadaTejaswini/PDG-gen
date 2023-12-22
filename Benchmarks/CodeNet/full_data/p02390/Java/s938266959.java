import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		int h,m,s;
		int S=scan.nextInt();
		h=S/3600;
		S=S%3600;
		m=S/60;
		s=S%60;
		System.out.printf("%d:%d:%d\n",h,m,s);
		
		
		scan.close();
	}
}