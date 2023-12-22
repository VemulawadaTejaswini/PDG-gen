import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			if(n==0){
				break;
			}
			int[][] a = new int[n][n];
			int[] now = {n/2,n/2+1};
			int count=1;
			a[now[0]][now[1]]=count++;
			
			while(count<=n*n){
				
				now[0]=(now[0]+1)%n;
				now[1]=(now[1]+1)%n;
				while(a[now[0]][now[1]]!=0){
					now[0]=(now[0]-1)%n;
					if(now[0]<0){
						now[0]=n-1;
					}
					now[1]=(now[1]+1)%n;
				}
				a[now[0]][now[1]]=count++;
			}
			for(int i = 0; i < n;i++){
				System.out.print(String.format("%4d", a[0][i]));
				for(int j = 1;j<n;j++){
					System.out.print(String.format("%4d", a[j][i]));
				}
				System.out.println();
			}
		}
	}
}