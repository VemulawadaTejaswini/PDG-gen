import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		for(int i=0;i<N;i++){
			int A=stdIn.nextInt();
			if(A%2==0)
				if(A%3!=0&&A%5==0){
					System.out.println("DENIED");
					System.exit(0);
				}
		}
		System.out.println("APPROVED");
	}
}
