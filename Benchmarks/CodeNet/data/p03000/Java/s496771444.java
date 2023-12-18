import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int ans=1;
		int rui=0;
		for(int i=0;i<a;ans++) {
			int c=scan.nextInt();
			rui+=c;
			if(rui>b) {
				break;
			}
		}
		System.out.println(ans);
	}
}
