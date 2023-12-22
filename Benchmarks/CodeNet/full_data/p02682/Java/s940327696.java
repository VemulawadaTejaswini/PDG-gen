import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int A=sc.nextInt();
	int B=sc.nextInt();
	int C=sc.nextInt();
	int K=sc.nextInt();
	int max=0;
	if(K>=A) {
		max+=A;
		K-=A;
		if(K>=B) {
			K-=B;
			if(K>=C) {
				max-=C;
			}
			else{
				max-=K;
			}
		}
		else {
		}
	}
	else {
		max+=K;
	}
	System.out.println(max);
	}
	
}
