import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for( ; ; ){
			int midterm, final_test, double_test;
			midterm = sc.nextInt();
			final_test = sc.nextInt();
			double_test = sc.nextInt();
			
			if(midterm == -1 && final_test == -1 && double_test == -1) break;
			
			if(midterm == -1 || final_test == -1) System.out.println('F');
			
			if(midterm + final_test >= 80){
				System.out.println('A');
			}else if(midterm + final_test >= 65){
				System.out.println('B');
			}else if(midterm + final_test >= 50){
				System.out.println('C');
			}else if(midterm + final_test >= 30){
				if(double_test >= 50) System.out.println('C');
				else System.out.println('D');
			}else{
				System.out.println('F');
			}
		}
	}
}