import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int C=stdIn.nextInt();
		int ans=A+B;
		if(ans>B+C)
			ans=B+C;
		if(ans>A+C)
			ans+=A+C;
		System.out.println(ans);
	}
}