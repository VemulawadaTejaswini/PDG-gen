import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args){
		sc = new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			int x=sc.nextInt();
			int a=0;
			if(n==0&&x==0)break;
			for(int i=1;i<=n-2;i++){
				for(int j=i+1;j<=n-1;j++){
					for(int k=j+1;k<=n;k++){
						if(i+j+k==x){
							a=a+1;
							break;
						}
					}
				}
			}
			System.out.println(a);
		}
	}
}