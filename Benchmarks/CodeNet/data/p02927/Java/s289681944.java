import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int d=sc.nextInt();
		int c=0;
		for(int i=1;i<=m;i++) {
			for(int j=20;j<=d;j++) {
				int x=j/10;
				int y=j%10;
				if(x*y==i) {
					if(y!=1)
					    c++;
				}
			}
		}
		System.out.println(c);
				

	}

}