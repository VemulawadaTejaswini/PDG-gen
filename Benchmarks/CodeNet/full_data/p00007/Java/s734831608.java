import java.util.Scanner;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		int n =  s.nextInt();
	  double sum = 100000;
	  double dept=0;
	 for(int i=0;i<n;i++){
		 sum*=1.05;
		 dept =sum%1000;
		 if(dept!=0){
			 sum+=(1000-dept);
		 }
	 }
	 System.out.println((int)sum);
	}
}