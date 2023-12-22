import java.util.Scanner;
class Main{
	
	Scanner sc = new Scanner(System.in);
	
	int a;
	int b;
	int d;
	int r;
	float f;
	
	void cp1(){
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.print(d = a/b);
		System.out.print(" ");
		System.out.print(r = a%b);
		System.out.print(" ");
		System.out.println(f =(float)a/(float)b);
		
	}
	
		
		
			
		public static void main(String[]agrs){
			new Main().cp1();
		}
	}