import java.util.*;
public class Main {
	

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		if(A!=1&&B!=1) {
			if(A>B) {
				System.out.println("Alice");
			}else if(B>A){
				System.out.println("Bob");
			}else {
				System.out.println("Draw");
			}
		}else {
			if(A==1&&B!=1) {
				System.out.println("Alice");
			}else if(A!=1&&B==1) {
				System.out.println("Bob");
			}else {
				System.out.println("Draw");
			}
		}
		
			
		
	}

}
