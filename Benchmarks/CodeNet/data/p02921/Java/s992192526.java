import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		double sum = 0;
		for (int i=1;i<=12;i++){
			double a=sc.nextDouble();
			sum = sum+a;
		}
		System.out.println("$"+sum/12);
	}

}
