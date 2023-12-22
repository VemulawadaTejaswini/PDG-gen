#include<stdio.h>
#include<stdlib.h>
typedef struct team{
	int p;
	char n[23];
}TEAM;
int comp(const void *p,const void *q){
	TEAM *a=(TEAM *)p,*b=(TEAM *)q;
	return b->p - a->p;
}
TEAM x[12];
int main(){
	int n,p,q,r,i,f=1;
	while(scanf("%d",&n)!=EOF){
		if(n==0)break;
		if(f==1)f==0;
		else printf("\n");
		for(i=0;i<n;i++){
			scanf("%s%d%d%d",x[i].n,&p,&q,&r);
			x[i].p=p*3+r;
		}
		qsort(x,n,sizeof(TEAM),comp);
		for(i=0;i<n;i++)printf("%s,%d\n",x[i].n,x[i],p);
	}
	return 0;
}