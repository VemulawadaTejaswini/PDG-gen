import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		char[][] s=new char[h][];
		for(int i=0;i<h;i++){
			s[i]=sc.next().toCharArray();
		}
		
		int[][] r=new int[h][w];

		//r//
		char test;
		r[0][w-1]=0;
		for(int i=0;i<h;i++){
			for(int j=w-1;j>=0;j--){
				test=s[i][j];
				//System.out.println(test);//	
				if(j==w-1){
					if(test=='#'){
						r[i][j]=0;
					}else if(test=='.'){
						r[i][j]=1;
					}
				}else{
					if(test=='#'){
						r[i][j]=0;
					}else if(test=='.'){
						r[i][j]=r[i][j+1]+1;
					}
				}
			}
		}

		//l//
		
		int[][] l=new int[h][w];
		l[0][0]=0;
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				test=s[i][j];
				//System.out.println(test);//	
				if(j==0){
					if(test=='#'){
						l[i][j]=0;
					}else if(test=='.'){
						l[i][j]=1;
					}
				}else{
					if(test=='#'){
						l[i][j]=0;
					}else if(test=='.'){
						l[i][j]=l[i][j-1]+1;
					}
				}
			}
		}

		//u//
		int[][] u=new int[h][w];
		u[0][0]=0;
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				test=s[i][j];
				//System.out.println(test);//	
				if(i==0){
					if(test=='#'){
						u[i][j]=0;
					}else if(test=='.'){
						u[i][j]=1;
					}
				}else{
					if(test=='#'){
						u[i][j]=0;
					}else if(test=='.'){
						u[i][j]=u[i-1][j]+1;
					}
				}
			}
		}

		//d//
		int[][] d=new int[h][w];
		d[h-1][0]=0;

		for(int i=h-1;i>=0;i--){
			for(int j=0;j<w;j++){
				test=s[i][j];
				//System.out.println(test);//	
				if(i==h-1){
					if(test=='#'){
						d[i][j]=0;
					}else if(test=='.'){
						d[i][j]=1;
					}
				}else{
					if(test=='#'){
						d[i][j]=0;
					}else if(test=='.'){
						d[i][j]=d[i+1][j]+1;
					}
				}
			}
		}

		int max=0;
		int p;
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				p=r[i][j]+l[i][j]+u[i][j]+d[i][j]-3;
				if(p>max)
					max=p;
			}
		}
		System.out.println(max);
	}
}