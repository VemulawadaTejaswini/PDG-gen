import java.util.Scanner;
public class Q1{
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);

		int A, B;
		A=sc.nextInt();
		B=sc.nextInt();
		
		
		if(((A*2)-1) > A+B &&  ((A*2)-1) > ((B*2)-1)){
			System.out.println((A*2)-1);

		}else if(((B*2)-1) > A+B && ((B*2)-1) >((A*2)-1) ) {
			System.out.println((B*2)-1);
			
		}else {
			System.out.println(A+B);
		}
	}
}

