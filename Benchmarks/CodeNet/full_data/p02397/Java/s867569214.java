import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i=1;
		int a;
		while(true) {
			int x=scan.nextInt();
			int y=scan.nextInt();
			if(x==0 && y==0) break;
			else if(y<x) {
				a=x;
				x=y;
				y=a;
			}
			System.out.println("Case "+i+": "+x+" "+y);
			i++;
		}
		scan.close();
}
}
