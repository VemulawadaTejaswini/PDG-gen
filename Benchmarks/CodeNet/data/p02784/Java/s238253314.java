import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int H=stdIn.nextInt();
		int N=stdIn.nextInt();
		int ans=0;
		for(int i=0;i<N;i++){
			ans+=stdIn.nextInt();
		}
		if(ans>=H)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
