import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=scan.nextInt();
			int x,y=0;
			for(x=a;x<=b;x++) {
				if(c%x == 0)
					y=y+1;
			}
			System.out.println(y);
		scan.close();
}
}
