import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		long ans=0;
		for(int i=1;i<=N;i++){
			if(i%3!=0&&i%5!=0)
				ans+=i;
		}
		System.out.println(ans);
	}
}
