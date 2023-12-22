import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		int a=n.nextInt();
		int b=n.nextInt();
		while (a != 0 || b != 0){
			
			if (a>b){
				System.out.println(b+" "+a);
			}else{System.out.println(a+" "+b);
			}
			a=n.nextInt();
			b=n.nextInt();
		}
	}

}