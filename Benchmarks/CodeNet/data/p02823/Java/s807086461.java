import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		long N=stdIn.nextLong();
		long A=stdIn.nextLong();
		long B=stdIn.nextLong();
		if((B-A)%2==0){
			System.out.println((B-A)/2);
		}
		else{
			int X=Math.max(A-1,B-1);
			int Y=Math.max(N-A,N-B);
			System.out.println(Math.min(X,Y));
		}
	}
}
