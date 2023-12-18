import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		
		int[] a = new int[n];
		for(int i =0 ; i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		int[][] dual = new int[n+1][20];
		for(int i=0;i<20;i++) {
			dual[0][i]=0;
		}
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<20;j++) {
				if(Math.pow(2, 19-j)<=a[i]) {
					dual[i+1][j]=1;
					a[i]-=Math.pow(2, 19-j);
				}else {
					dual[i+1][j]=0;
				}
			}
		}
		for(int i = 1;i<n+1;i++) {
			for(int j = 0;j<20;j++) {
				dual[i][j]+= dual[i-1][j];
			}
		}
		
		int counter  =0;
		boolean flag  =true;
		for(int i=0;i<n+1;i++) {
			for(int j=i+1;j<n+1;j++) {
				flag = true;
				for(int k=0;k<20;k++) {
					if(dual[j][k]-dual[i][k]>1) {
						flag =false;
						break;
					}
				}
				if(flag) {
					counter++;
				}
			}
		}
		
		System.out.println(counter);

	}

}

class City{
	int order;
	int prefecture;
	int year;
	int number;
	City(int order,int prefecture, int year){
		this.order = order;
		this.prefecture = prefecture;
		this.year = year;
	}
}