import java.util.Scanner;

public class Main {
	public static void main(String [] args){ 
		int n;
		Scanner sc = new Scanner(System.in);
		double a = 0;
		while(true){
			n = sc.nextInt();
			if(n == 0)break;
			int [] stu;
			double sum = 0;
			stu  = new int[n];
			for(int i=0;i<n;i++){
				stu[i] = sc.nextInt();
				sum = sum +stu[i];
			}
			double m = sum/n;
			for(int i=0; i<n; i++){
				a = (stu[i]-m)*(stu[i]-m);
			}
				a = a/n;
		
				a = Math.sqrt(a);
				System.out.println(a);

		}
	}

}