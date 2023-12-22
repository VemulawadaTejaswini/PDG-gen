import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		//??????????????°
		Scanner sc;		//??\???
		int a=0;
		int b=0;
		int kotae=0;
		int i=0;

		sc = new Scanner(System.in);

		while(i < 200){

			a = sc.nextInt();
			b = sc.nextInt();
			kotae = a + b;
			//if(a==0 && b==0){
				//break;
			//}

			String skotae = String.valueOf(kotae);
			int keta = skotae.length();

			//a=0;
			//b=0;

			System.out.println(keta);
			i= i+1;
		}
	}
}