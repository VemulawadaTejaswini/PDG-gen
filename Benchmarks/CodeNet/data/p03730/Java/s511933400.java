import java.util.Scanner;

class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int a,b,c;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		scan.close();
		
		Boolean flag = false; 
		for(int i = 1; i <= b; i++){
			if(a * i % b == c)flag = true;
		}
		
		System.out.print(flag ? "Yes":"No");
		
	}
}