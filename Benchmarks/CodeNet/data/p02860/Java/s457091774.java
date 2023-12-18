import java.util.Scanner;
public class Main {
	int kanadasine[]=new int[100];
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		String S=stdIn.next();
		if(N%2==1)
			System.out.println("No");
		else
			if(S.substring(0,N/2).equals(S.substring(N/2,N)))
				System.out.println("Yes");
			else
				System.out.println("No");
	}
}
