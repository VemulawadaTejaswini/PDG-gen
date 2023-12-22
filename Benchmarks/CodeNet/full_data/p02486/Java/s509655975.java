import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int n;
		int x;
		int sum;
		int flg=0;
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			x = sc.nextInt();
			if(n==0&&x==0){
				break;
			}
			for(int i=1;i<=n;i++){
				if(i>x){
					break;
				}
				for(int j=i+1;j<=n;j++){
					if((i+j)>x){
						break;
					}
					for(int k=j+1;k<=n;k++){
						sum=i+j+k;
						if(sum==x){
							flg++;
						}
					}
				}
			}
                        flg=0;
			System.out.printf("%d\n",flg);
		}
	}
}