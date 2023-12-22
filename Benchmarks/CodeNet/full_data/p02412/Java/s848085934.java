import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int n,x,i,j,k,a;
		while(true){
			n=stdIn.nextInt();
			x=stdIn.nextInt();
			if(n==0&&x==0)break;
			a=0;
			for(i=1;i<n-1;i++)for(j=i+1;j<n;j++)for(k=j+1;k<=n;k++)if(i+j+k==x)a++;
			System.out.println(a);
		}
	}
}
