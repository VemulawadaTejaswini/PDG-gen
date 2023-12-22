import java.util.Scanner;
public class Main{
	Scanner sc=new Scanner(System.in);
	int n,m;
	
	void a(){
		for(int i=0; i<7; i++){
			n=sc.nextInt();
			m=sc.nextInt();
			System.out.println(n-m);
		}
	}
		
	public static void main(String[]agrs){
		new Main().a();
	}
}
		