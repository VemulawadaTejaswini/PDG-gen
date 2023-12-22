import java.util.Scanner;

public class Main {

	static int[] v={-1,0,1};
	static int N;
	static int[][] a;
	static int[][][] field;
	static int cnt=0;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		for(;;){
			N=cin.nextInt();
			if(N==0)break;
			field=new int[5][5][5];
			a=new int[27][2];
			for(int i=0;i<27;i++){
				a[i][0]=a[i][1]=-1;
			}
			for(int i=0;i<5;i++){
				for(int j=0;j<5;j++){
					char[] s=cin.next().toCharArray();
					for(int k=0;k<5;k++){
						field[i][j][k]=s[k]-'0';
					}
				}
			}
			// 居ない時
			int m1=cin.nextInt();
			for(int i=0;i<m1;i++){
				a[i][0]=cin.nextInt();
			}
			// 居る時
			int m2=cin.nextInt();
			for(int i=0;i<m2;i++){
				a[i][1]=cin.nextInt();
			}
			for(int n=0;n<N;n++){
				boolean[][][] change=new boolean[5][5][5];
				for(int i=0;i<5;i++){
					for(int j=0;j<5;j++){
						int sum=0,ind=0;
						for(int k=0;k<5;k++){
							sum=check(i,j,k);
							// inai
							ind=field[i][j][k];
							if(ind==0){
								for(int l=0;l<27;l++){
									if(a[l][ind]==-1)break;
									if(sum==a[l][ind]){
										change[i][j][k]=true;
										break;
									}
								}
							}
							else{
								boolean f=false;
								change[i][j][k]=true;
								for(int l=0;l<27;l++){
									if(a[l][ind]==-1)break;
									if(sum==a[l][ind]){
										change[i][j][k]=false;
										break;
									}
								}
							}
						}
					}
				}
				for(int i=0;i<5;i++){
					for(int j=0;j<5;j++){
						for(int k=0;k<5;k++){
							if(change[i][j][k]){
								field[i][j][k]=1-field[i][j][k];
							}
						}
					}
				}
			}
			output();
		}
	}
	static void output(){
		System.out.print("Case");
		System.out.printf("%2d",(++cnt));
		System.out.println(":");
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				int sum=0,ind=0;
				for(int k=0;k<5;k++){
					System.out.print(field[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	static int check(int x,int y,int z){
		int re=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					if(i==1&&j==1&&k==1)continue;
					int xx=x+v[i];
					int yy=y+v[j];
					int zz=z+v[k];
					if(xx<0||yy<0||zz<0||xx>=5||yy>=5||zz>=5){
						continue;
					}
					re+=field[xx][yy][zz];
				}
			}
		}
		return re;
	}
}