import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int Student;
		System.out.println(" Enter the number of Students");
		Student = input.nextInt();
		int sum =0;
		for (int i=0;i<=Student;i++)
			sum+= i;
			System.out.println("the number of candies in total is "+ sum);
			
			
			
			
		}

}
