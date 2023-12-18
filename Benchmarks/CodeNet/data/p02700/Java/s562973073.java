import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int A=sc.nextInt();
	int B=sc.nextInt();
	int C=sc.nextInt();
	int D=sc.nextInt();
	int i=0;
	int j=0;
	for(;;) {
		i++;
		C-=B;
		if(C<=0) {
			break;
		}
	}
	for(;;) {
		j++;
		A-=D;
		if(A<=0) {
			break;
		}
	}
	if(i<=j) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}
	}
}