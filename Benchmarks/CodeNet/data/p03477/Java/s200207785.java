import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int A=scan.nextInt();
		int B=scan.nextInt();
		int C=scan.nextInt();
		int D=scan.nextInt();
		int l=0,r=0;
		l=A+B;
		r=C+D;
		if(l<r){
			System.out.println("Right");
		}
		else if(l>r){
			System.out.println("Left");
		}
		else if(l==r){
			System.out.println("Balanced");
		}
	}
}