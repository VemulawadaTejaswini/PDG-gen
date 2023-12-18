import java.util.Scanner;

class Main{
	
	
	public static void main(String[] args) {
		new Main().Kei();
	}
	
	void Kei() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int g=a*b;
		if((g%2)==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
	
}


