mport java.util.Scanner;
public class Main{
 static int[][] tree;
 static int[]par;
	public static void main(String[] args) {
	int x,i,j,n,pn,swi=0,root = 0;
	// TODO Auto-generated method stub
     Scanner sca = new Scanner(System.in);
     n=sca.nextInt();
     tree = new int[n][n+1];
     par=new int[n];
    for(j=0;j<n;j++){
    	x=sca.nextInt();
	if(j==0)root=x;
    	tree[x][n]=pn=sca.nextInt();
    	for(i=0;i<pn;i++) {
    		tree[x][i]=sca.nextInt();
    	}
    	if(swi==0&&pn!=0){
    		swi=-1;
    		root=x;
    	}
    }
    chain(root,n,-1);
     for(i=0;i<n;i++){
    	 System.out.print("node "+i+": parent ="+ par[i]+", depth = "+serdepth(i,0)+", ");
    	if(par[i]==-1){
    	System.out.print("root, [");
    	}else if(tree[i][n]==0){
    	 System.out.print("leaf, [");
    	}else{
    		System.out.print("internal node, [");
    	}
    	for(j=0;j<tree[i][n]-1;j++){
    		System.out.print(tree[i][j]+", ");
    	}
   if(tree[i][n]!=0){
	   System.out.println(tree[i][j]+"]");
   }else{
	   System.out.println("]");	   
   }
  }
	}
    public static void chain(int chi,int n,int p){
	int i;
	 par[chi]=p;
	if(tree[chi][n]==0)return;
	for(i=0;i<tree[chi][n];i++){
	    chain(tree[chi][i],n,chi);
	}
	}
	public static int serdepth(int x,int cnt){
		if(par[x]==-1)return cnt;
		cnt++;
		return serdepth(par[x],cnt);
	}
}
