import java.util.Scanner;
public class main.java {
	static void main (String[]args){
		Scanner tc =new Scanner(System.in);
		int N,S;
		N=tc.nextInt();
		if(N<=3){
			S = (N - 2 )*180;
		}else{
			N=tc.nextInt();
			S = (N - 2)*180;

		}
		System.out.println(S);
	}

}