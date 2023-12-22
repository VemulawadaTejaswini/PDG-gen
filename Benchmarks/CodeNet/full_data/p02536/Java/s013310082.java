import java.util.*;
class Main{
	static final int MaxN=100000+1;
	static int id[]=new int [MaxN];
static int rank[]=new int [MaxN];
public static class DSU{


static int root(int i){
	while(i!=id[i]){
		i=id[i];
	}
	return i;
}

static void union(int p,int q){
int i=root(p);
int j=root(q);
if(rank[i]>rank[j]){
id[j]=id[i];
rank[j]+=rank[i];
}
if(rank[i]<=rank[j]){
id[i]=id[j];
rank[i]+=rank[j];
}}
static boolean connected(int i,int j){

	return root(i)==root(j);
}

}
	static Scanner scan=new Scanner(System.in);
public static void main(String[] args) {
	for(int i=0;i<MaxN;i++)
		id[i]=i;
	for(int i=0;i<MaxN;i++)
		rank[i]=1;
	int n=scan.nextInt();
	int m=scan.nextInt();
	int temp=0;
	for(int i=0;i<m;i++){
		int a=scan.nextInt();
		int b=scan.nextInt();
DSU.union(a,b);
if(i==0)
temp=DSU.root(a);	}
int cnt=0;


	for(int i=1;i<=n;i++){
		if(!DSU.connected(i,temp)){
cnt++;
DSU.union(i,temp);
}
	}

System.out.println(cnt);
}
}