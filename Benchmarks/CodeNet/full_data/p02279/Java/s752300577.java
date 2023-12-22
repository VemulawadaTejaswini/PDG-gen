import java.util.Scanner;
public class Main{
    static tree[] wd;
	public static void main(String[] args) {
	    int x,i,j,n,pn,swi=0,root = 0,hz;
	// TODO Auto-generated method stub
     Scanner sca = new Scanner(System.in);
     n=sca.nextInt();
     wd=new tree[n];
    for(j=0;j<n;j++){
    	x=sca.nextInt();
	if(j==0)root=x;
    	pn=sca.nextInt();
	wd[x]=new tree(x,pn);
    	for(i=0;i<pn;i++) {
	    hz=sca.nextInt();
	    if(hz==root) root=x;
	    wd[x].setchil(hz,i);
    	}
    	if(swi==0&&pn!=0){
    		swi=-1;
    		root=x;
    	}
    }
    chain(root,-1);
     for(i=0;i<n;i++){
    	 System.out.print("node "+i+": parent = "+ wd[i].getpar()+", depth = "+serdepth(i,0)+", ");
	 if(wd[i].getpar()==-1){
    	System.out.print("root, [");
	 }else if(wd[i].getn()==0){
    	 System.out.print("leaf, [");
    	}else{
    		System.out.print("internal node, [");
    	}
	 for(j=0;j<wd[i].getn();j++){
	     System.out.print(wd[i].getchil(j));
	     if(j+1<wd[i].getn()){
    			System.out.print(", ");
    		}
    	}
	   System.out.println("]");	   
   
     }
	}
    public static void chain(int chi,int p){
	int i;
	wd[chi].setpar(p);
	if(wd[chi].getn()==0)return;
	for(i=0;i<wd[chi].getn();i++){
	    chain(wd[chi].getchil(i),chi);
	}
	}
	public static int serdepth(int x,int cnt){
	    if(wd[x].getpar()==-1)return cnt;
		cnt++;
		return serdepth(wd[x].getpar(),cnt);
	}
    
}
class tree{
    int node,par,n,i;
    int[]children;
    tree(int node,int n){
	this.n=n;
	this.node=node;
	children= new int[n];
    }
    public void setchil(int c,int p){
	children[p]=c;
    }
    public int getchil(int c){
	return children[c];
    }
    public void setpar(int p){
	par=p;
    }
    public int getpar(){
	return par;
    }
    public boolean existch(int p){
	for(i=0;i<n;i++){
	    if(p==children[i])return true;
	}
	return false;
    }
    public int getn(){
	return n;
    }
    
}

