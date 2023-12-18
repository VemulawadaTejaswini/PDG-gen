import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int K=stdIn.nextInt();
		if(N%2==0){
			if(K<=N/2)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		else
			if(K<=(N/2)+1)
				System.out.println("YES");
			else
				System.out.println("NO");
	}
}
