import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N=cin.nextInt();
		while(N--!=0){
			int[][] a = new int[5][5];
			for(int i = 0;i<5;i++){
				for(int j=0;j<5;j++){
					a[i][j]=cin.nextInt();
				}
			}
			int max=0;
			for(int i = 0;i<5;i++){
				for(int j = 0;j<5;j++){
					for(int k=1;k+i<=5;k++){
						for(int l=1;l+j<=5;l++){
							boolean f = true;
							for(int x=i;x<k+i;x++){
								for(int y=j;y<l+j;y++){
									if(a[x][y]==0){
										f=false;
									}
								}
							}
							if(f){
							max=Math.max((k)*(l),max);
							}
						}
					}
				}
			}
			System.out.println(max);
		}

	}

}