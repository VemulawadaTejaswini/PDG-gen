import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();
		int h=sc.nextInt()+1;
		int n=sc.nextInt();
		boolean f[][]=new boolean [w][h];
		for(int i=0;i<w;i++){
			for(int j=0;j<h;j++){
				f[i][j]=true;
			}
		}
		for(int i=0;i<n;i++){
			int x=sc.nextInt();
			int y=sc.nextInt();
			int a=sc.nextInt();
			
			
			if(a==1){
				for(int u=0;u<w;u++){
					for(int k=0;k<h;k++){
						if(k<x){
							f[u][k]=false;
						}
					}
				}
			}else if(a==2){
				for(int u=0;u<w;u++){
					for(int k=0;k<h;k++){
						if(k>=x){
							f[u][k]=false;
						}
					}
				}
			}else if(a==3){
				for(int u=0;u<w;u++){
					for(int k=0;k<h;k++){
						if(u<y){
							f[u][k]=false;
						}
					}
				}
			}else if(a==4){
				for(int u=0;u<w;u++){
					for(int k=0;k<h;k++){
						if(u>=y){
							f[u][k]=false;
						}
					}
				}
			}
			/*for(int u=0;u<w;u++){
				for(int k=0;k<h;k++){
					
					System.out.print(f[u][k]+" ");
				}
				System.out.println();
			}
			System.out.println("-------------");
			*/
		}
		int sum=0;
		for(int u=0;u<w;u++){
			for(int k=0;k<h;k++){
				if(f[u][k]){
					sum++;
				}
				//System.out.print(f[u][k]+" ");
			}
			//System.out.println();
		}
		System.out.println(sum);
	}

}
