import java.util.Scanner;

class	Main{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int a =  scanner.nextInt();			
		int b =  scanner.nextInt();			
		int c =  scanner.nextInt();			
		hikaku(a,b,c);

	}

	public static void hikaku(int a, int b , int c){
		if(a<b && b<c){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}