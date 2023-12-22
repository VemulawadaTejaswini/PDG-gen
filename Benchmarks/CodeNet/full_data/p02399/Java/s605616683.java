import java.util.*;
class Main{
	Scanner sc=new Scanner(System.in);
	int a,b;
	void g(){
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println((float)a/b);
		
	}
	
	public static void main(String[]agrs){
		new Main().g();
	}
}