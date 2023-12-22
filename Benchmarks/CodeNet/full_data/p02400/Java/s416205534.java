import java.util.*;
public class Main{
	Scanner sc = new Scanner(System.in);
	double r;
	void e(){
		r=sc.nextDouble();
		
		System.out.print(r*r*3.14);
		System.out.print(" ");
		System.out.println(2*3.14*r);
		
	}
	
	public static void main(String[] args){     
		new Main().e();     
		} 
	}