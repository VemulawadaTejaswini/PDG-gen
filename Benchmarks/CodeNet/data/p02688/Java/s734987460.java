import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int K=stdIn.nextInt();
		boolean sunuke[]=new boolean[N];
		int ans=N;
		for(int i=0;i<K;i++){
			int a=stdIn.nextInt();
			for(int j=0;j<a;j++){
				int b=stdIn.nextInt()-1;
				if(sunuke[b]==false)
					ans--;
				sunuke[b]=true;
			}
		}
		System.out.println(ans);
	}
}
