import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	int X=scan.nextInt();
	int A=0;
	int B=0;
	outside: for(int i=-118;i<120;i++) {
		for(int j=-119;j<119;j++) {
			int Y=i*i*i*i*i-j*j*j*j*j;
			if(Y==X) {
				A=i;
				B=j;
				break outside;
			}
		}
	}
	System.out.println(A+" "+B);
	}
}
