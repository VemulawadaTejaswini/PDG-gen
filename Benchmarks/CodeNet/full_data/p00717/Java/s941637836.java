import java.util.*;
class Main{
    int[][][] d;
    int[][][] p;
    void run(){
	Scanner sc=new Scanner(System.in);
	while(true){
	    int n=sc.nextInt();
	    if(n==0)break;
	    n+=1;
	    d=new int[n][][];
	    for(int i=0;i<n;i++){
		int m=sc.nextInt();
		int[][] temp=new int[2][m];
		temp[0][0]=0;temp[1][0]=0;
		int preX=sc.nextInt();
		int preY=sc.nextInt();
		for(int j=1;j<m;j++){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    temp[0][j]=x-preX;preX=x;
		    temp[1][j]=y-preY;preY=y;
		}
		d[i]=temp;
	    }
	    p=new int[8][2][d[0][0].length];
	    p[0]=d[0];
	    for(int i=0;i<4;i++){
		p[i]=rotate(p[0],i);
	    }
	    int len=p[0][0].length;
	    for(int i=4;i<8;i++){
		p[i][0][0]=0;p[i][1][0]=0;
		for(int j=1;j<len;j++){
		    p[i][0][j]=p[i-4][0][len-j];
		    p[i][1][j]=p[i-4][1][len-j];
		}
	    }
	    for(int i=1;i<n;i++){
		if(solve(d[i]))System.out.println(i);
	    }
	    System.out.println("+++++");
	}
    }
    int[][] rotate(int[][] a,int b){
	int[][] r=new int[2][a[0].length];
	for(int i=0;i<a[0].length;i++){
	    int e[]={a[0][i],a[1][i]};
	    r[0][i]=(b==1||b==2 ? -1:1)*e[b%2];
	    r[1][i]=(b>=2 ? -1:1)*e[1-b%2];
	}
	return r;
    }
    boolean solve(int[][] a){
	for(int i=0;i<8;i++){
	    if(Arrays.equals(a[0],p[i][0])&&Arrays.equals(a[1],p[i][1]))return true;
	}
	return false;
	}
    public static void main(String[] args){
	new Main().run();
    }
}