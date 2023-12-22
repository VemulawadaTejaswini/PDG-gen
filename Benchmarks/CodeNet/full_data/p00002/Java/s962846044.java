import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		int set;
		
		Scanner sc = new Scanner(System.in);
		
		for(;;){
			
			a = sc.nextInt();
			b = sc.nextInt();
			
			a=a+b;
			b=0;
			
			for(;a>0;a=a/10) b++;
			
			System.out.println(b);
		}
	
	}

}