import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		int N,D,ans=0;
		Scanner sc = new Scanner(System.in);
		D=sc.nextInt();//何日間の予定をたてるか
		N=sc.nextInt();//何枚の服を所持しているか
		int temperature[]=new int[D+1];
		int min[]=new int[N];
		int max[]=new int[N];
		int show[]=new int[N];
		int showreminder[][]=new int[D][N];
		for(int i=0;i<D;i++){
			temperature[i]=sc.nextInt();
		}
		for(int j=0;j<N;j++){
			min[j]=sc.nextInt();
			max[j]=sc.nextInt();
			show[j]=sc.nextInt();
		}
		
		
		for(int i=1;i<D;i++){
			for(int j=0;j<N;j++){
				if(min[j]<=temperature[i]&&max[j]>=temperature[i]){
					for(int k=0;k<N;k++){
						if(min[k]<=temperature[i-1]&&max[k]>=temperature[i-1]){
							if(showreminder[i][j]<showreminder[i-1][j]+Math.abs(show[k]-show[j])){
								showreminder[i][j]=showreminder[i-1][k]+Math.abs(show[k]-show[j]);
							}
						}
					}
				}
			}
		}
		for(int i=0;i<N;i++){
			if(ans<showreminder[D-1][i]){
				ans=showreminder[D-1][i];
			}
		}
		System.out.println(ans);
	}
}