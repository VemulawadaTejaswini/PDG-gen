import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	
int A,B,C,D;

Scanner sc = new Scanner(System.in);
 A = sc.nextInt();

 B = sc.nextInt();

 C = sc.nextInt();

 D = sc.nextInt();

do {
	
	
	C=C-B;
	if(C<=0) {
		System.out.println("Yes");
		System.exit(0);
	}
	A=A-D;
	if(A<=0) {
		System.out.println("No");
		System.exit(0);
	}
}
while(true);
	}
}