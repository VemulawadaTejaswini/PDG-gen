import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc  = new Scanner(System.in);
		int a[][] = new int[3][3];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
			}
		}
		int h[] = {0,0,0};
		int w[] = {0,0,0};
		int nn[] = {0,0};
		int n = sc.nextInt();
		for(int k=0;k<n;k++){
			int b = sc.nextInt();
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[i].length;j++){
					if(a[i][j]==b){
						a[i][j]=0;
						h[i]++;
						w[j]++;
						if(i==1&&j==1){
							nn[0]++;
							nn[1]++;
						}else if(i==j){
							nn[0]++;
						}else if(i==a.length-1-j||j==a.length-1-i){
							nn[1]++;
						}
					}
				}
			}
		}
		for(int i=0;i<3;i++){
			if(h[i]==3||w[i]==3){
				System.out.println("Yes");
				System.exit(0);
			}
		}	
		for(int i=0;i<2;i++){
			if(nn[i]==3){
				System.out.println("Yes");
				System.exit(0);
			}
		}
		System.out.println("No");
	}
}
