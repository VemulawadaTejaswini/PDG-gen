import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		if(N<=0)
			System.out.println("0");
		else {
			long count;
			if(A>B)
				System.out.println("0");
			else if(A==B)
				System.out.println("1");
			else if(N==1&&A!=B)
				System.out.println("0");
			else {
				long low=(N-1)*A+B;
				long high=A+(N-1)*B;
				count=high-low+1;
				System.out.println(count);
			}
		}	
	}

}
