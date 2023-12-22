import java.util.Scanner;
public class Main{
    static tree[] wd;
    static int root =-1;
	public static void main(String[] args) {
	    int i=0,j,n,hz;
	    String x;
	// TODO Auto-generated method stub
     Scanner sca = new Scanner(System.in);
     n=sca.nextInt();
     wd=new tree[n];
    for(j=0;j<n;j++){
       x=sca.next();
    	if(x.equals("insert")){
	    wd[i]=new tree(sca.nextInt());
	    insert(i);
	    i++;
	 }
    	if(x.equals("print")){
    	    inorder(root);
    	    System.out.println("");
    	    preorder(root);
    	    System.out.println("");  		
    	}
	if(x.equals("find")){
	    if(find(sca.nextInt(),root)!=-1){
		System.out.println("yes");
	    }else{
		System.out.println("no");
	    }
	}
	if(x.equals("delete")){
	    hz=find(sca.nextInt(),root);
	    if(hz!=-1)delete(hz);
     	}
    }
   }
    public static void preorder(int nd){
	System.out.print(" "+wd[nd].getnode());
	if(wd[nd].getleft()!=-1)preorder(wd[nd].getleft());
	if(wd[nd].getright()!=-1)preorder(wd[nd].getright());
    }
    public static void inorder(int nd){
	if(wd[nd].getleft()!=-1)inorder(wd[nd].getleft());
	System.out.print(" "+wd[nd].getnode());
	if(wd[nd].getright()!=-1)inorder(wd[nd].getright());
    }
    public static void insert(int data){//NIL->-1
     int y=-1,x=root;//parent of x
     while(x!=-1){
    	y=x;
    	if(wd[data].getnode()<wd[x].getnode()){
    		x=wd[x].getleft();
    	}else{
    		x=wd[x].getright();
    	}
    }
     if (y==-1){//it is root
    	 root=data;
     }else if(wd[data].getnode()<wd[y].getnode()){
    	 wd[y].setleft(data);
	 wd[data].setpar(y);
     }else{
    	 wd[y].setright(data);
	 wd[data].setpar(y);
     }
    }
    public static int find(int key,int opo){//true->index of factor false->-1 
	if(opo==-1)return -1;
	if(key==wd[opo].getnode())return opo;
	if(key<wd[opo].getnode()){
	return find(key,wd[opo].getleft());
	}else{
	return find(key,wd[opo].getright());
	}
    }
    public static int treesuccessor(int x){
	int y;
	if(wd[x].getright()!=-1)return treeminimum(wd[x].getright());
	y=wd[x].getpar();
	while(y!=-1&&x==wd[y].getright()){
	    x=y;
	    y=wd[y].getpar();
	}
	return y;
    }
    public static int treeminimum(int x){
	while(wd[x].getleft()!=-1){
	    x=wd[x].getleft();
	}
	return x;
    }
    public static void delete(int key){
	int y,x;
	if(wd[key].getleft()==-1||wd[key].getright()==-1){
	    y=key;
	}else{
	    y=treesuccessor(key);
	}
	if(wd[y].getleft()!=-1){
	    x=wd[y].getleft();
	}else{
	    x=wd[y].getright();
	}
	if(x!=-1)wd[x].setpar(wd[y].getpar());
	if(wd[y].getpar()==-1){
	    root=x;
	}else if(y==wd[wd[y].getpar()].getleft()){
	    wd[wd[y].getpar()].setleft(x);	  
	}else{
	    wd[wd[y].getpar()].setright(x);	         
	}
	if(y!=key)wd[key].setnode(wd[y].getnode());
	
    }
}
class tree{
    int node,par;
    int left=-1,right=-1;
    tree(int node){
	this.node=node;
    }
    public int getnode(){
	return node;
    }
    public void setnode(int node){
	this.node=node;
    }
    public void setleft(int c){
	left=c;
    }
    public int getleft(){
	return left;
    }
    public void setright(int c){
	right=c;
    }
    public int getright(){
	return right;
    }
    public void setpar(int c){
	par=c;
    }
    public int getpar(){
	return par;
    }

}

