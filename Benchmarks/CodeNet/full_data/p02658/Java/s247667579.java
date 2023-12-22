import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		long ans=1,key=1;
		key*=Math.pow(10,9);
		key*=Math.pow(10,9);
		for(int i=0;i<N;i++){
			long A=stdIn.nextLong();
			ans*=A;
			if(ans<0){
				System.out.println(-1);
				System.exit(0);
			}
		}
		if(ans>key){
			System.out.println(-1);
			System.exit(0);
		}
		System.out.println(ans);
	}
}
