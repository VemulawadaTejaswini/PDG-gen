import java.util.Scanner;
public class Main {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		while(sc.hasNextInt()) {
		 a=sc.nextInt();
		 b=sc.nextInt();
		if((a<10)&&(a>0)&&(b>0)&&(b<10)) {
			System.out.println(a*b);
		}
		else {
			System.out.println(-1);
		}
		}
	}

}
