import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int temp;

		// a ?????§???????????????
		if(a<b) {
			temp = a;
			a=b;
			b=temp;
		}
		
		while((a%b)!=0){
			temp = b;
			b=a%b;
			a=temp;
		}
		System.out.println(b);

	}

}