import java.util.*;
public class P0526{
    int[][] M = new int[101][101];
    int [] d = new int[101];
    int[] flg = new int[101];
    int a,n,m,c,e,k,min,z;
    public void compute(){
	Scanner scan = new Scanner(System.in);
	for(int i=0;i<101;i++){
	    for(int j=0;j<101;j++){
		M[i][j]=99999999;
	    }
	    d[i]=99999999;
	    flg[i]=0;
	}
	n=scan.nextInt();
	k=scan.nextInt();
	for(int i=0;i<k;i++){
	    a=scan.nextInt();
	    if(a==0){
		c=scan.nextInt();
		e=scan.nextInt();
		for(int j=1;j<=n;j++){
		    d[j]=99999999;
		    flg[j]=0;
		    
		}
		d[c]=0;
		while(true){
		    min=99999999;
		    for(int j=1;j<=n;j++){
			if(d[j]<min&&flg[j]==0){
			    min=d[j];
			    m=j;
			}
		    }
		    if(min==99999999)break;
		    flg[m]=1;
		    for(int j=1;j<=n;j++){
			if(d[j]>d[m]+M[m][j]){
			    d[j]=d[m]+M[m][j];
			}
		    }
		}
		if(d[e]==99999999){
		    System.out.println(-1);
		}else{
		    System.out.println(d[e]);
		}

	    }else{
		c=scan.nextInt();
		e=scan.nextInt();
		z=scan.nextInt();
		if(M[c][e]>z){
		    M[c][e]=z;
		    M[e][c]=z;
		}
	    }
	}
		
    }
    public static void main(String[] args){
	P0526 p = new P0526();
	p.compute();
    }
}