import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String A[]=new String [N];
		int a=0;
		for(int i=0;i<N;i++) {
			A[i]=sc.next();
			if(A[i].equals("Y")) {
				a=1;
			}
		}
		if(a==0) {
			System.out.println("Three");
		}else {
			System.out.println("Four");
		}
	}
}