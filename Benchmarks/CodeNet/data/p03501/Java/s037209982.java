import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		int rs1=N*A;
		if(rs1<B){
			System.out.println(rs1);
		}
		else if(rs1>B){
			System.out.println(B);
		}
		else if(rs1==B){
			System.out.println(B);
		}
	}

}