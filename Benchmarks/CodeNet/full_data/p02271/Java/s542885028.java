import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int n=stdIn.nextInt();
		int A[]=new int[n];
		boolean ans[]=new boolean[20*2000+1];
		for(int i=0;i<n;i++){
			A[i]=stdIn.nextInt();
		}
		for(int i=0;i<Math.pow(2,n);i++){
			int cout=0;
			for(int j=0;j<n;j++){
				  if((1&i>>j)==1)
					  cout+=A[j];
			}
			ans[cout]=true;
		}
		int q=stdIn.nextInt();
		for(int i=0;i<q;i++){
			int m=stdIn.nextInt();
			if(ans[m])
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}

