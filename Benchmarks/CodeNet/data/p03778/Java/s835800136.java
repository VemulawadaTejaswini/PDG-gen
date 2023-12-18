import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int W = sc.nextInt();
		if(a+W>b&&b>a){
			System.out.println(0);
		}
		if(b+W<a){
			System.out.println(""+ (a-(b+W)));
		}
		if(a< b+W && b+W < a+W){
			System.out.println(0);
		}
		if(a+W<b){
			System.out.println(""+(b-(a+W)));
		}
	}

}