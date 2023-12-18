import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble(),b=sc.nextDouble();
		double all =(a+b)/2;
		if(all%1==0)
			System.out.println((int)(all));
		else
			System.out.println((int)(all+1));
	}
}
