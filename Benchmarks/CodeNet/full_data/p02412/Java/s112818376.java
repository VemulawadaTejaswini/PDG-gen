import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n,x,ans;
		while(true){
			n=scan.nextInt();
			x=scan.nextInt();
			ans=0;
			if(n==0&&x==0) break;
			for(int i=1;i<=n;i++){
				for(int j=i+1;j<=n;j++){
					for(int k=j+1;k<=n;k++){
						if(i+j+k==x){
							ans++;
							break;
						}
						if(x<i+j+k){
							break;
						}
					}
					if(x<=i+j){
						break;
					}
				}
				if(x<=i){
					break;
				}
			}
			System.out.println(ans);
		}
		scan.close();
	}
}