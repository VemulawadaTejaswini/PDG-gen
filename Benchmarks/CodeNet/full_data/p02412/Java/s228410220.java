import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,x,ans;
		while(true){
			n=sc.nextInt();
			x=sc.nextInt();
			if(n==0&&x==0)break;
			ans=0;
			for(int i=1;i<=n-2;i++){
				for(int j=i+1;j<=n-1;j++){
					for(int k=j+1;k<=n;k++){
						if(i+j+k==x)
							ans++;
					}
				}
			}
			System.out.println(ans);
		}
}
}
