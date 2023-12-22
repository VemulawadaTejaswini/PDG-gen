#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<algorithm>
using namespace std;
#define maxn 10005

int n;
struct Node
{	
	int di;
	int num;
}qur[maxn];
double num[maxn];
struct node
{
	int l,r;
	int next;
	int data;
}tree[maxn<<2];
int flag;

void build(int p,int l,int r)
{
	tree[p].l=l;
	tree[p].r=r;
	tree[p].data=0;
	if (l+1==r)
		return;
	int mid=(l+r)>>1;
	build(p<<1,l,mid);
	build(p<<1|1,mid,r);
}

void updata(int p,double x,int k)
{
	if (tree[p].l+1==tree[p].r)
	{
		if (k)
			tree[p].data++;
		else
		{
			if (tree[p].data==0)
				flag=0;
			else
				tree[p].data--;
		}
		return;
	}
	int mid=(tree[p].l+tree[p].r)>>1;
	if (x<num[mid])
		updata(p<<1,x,k);
	else	
		updata(p<<1|1,x,k);
	if (flag)
	{
		if (k==0) tree[p].data--;
		else tree[p].data++;
	}
}

double cal(int p,int x)
{
	if (tree[p].l+1==tree[p].r)
		return num[tree[p].l];
	if (tree[p<<1].data>x)
		return cal(p<<1|1,x-tree[p<<1].data);
	return cal(p<<1,x);
}
long long dnum,ans,tp;
long long trans(double a)
{
	dnum=0;
	tp=a;
	a-=tp;
	long long res=a*(long long)(1e20);
	
	long long c;
	if(res==0)	
	{
		dnum=1;
		ans=tp;
		return 0;
	}
	while(res)
	{		
		c=res%10;		
		if(c!=0)
		{
			return c;
		}
		res/=10;
		
	}
}
int main()
{
	int t;
	scanf("%d",&t);
	while (t--)
	{
		scanf("%d",&n);
		int i;
		char st[10];
		for (i=1;i<=n;i++)
		{
			scanf("%s %lf",st,&num[i]);
			if (st[0]=='r')
				qur[i].di=0;
			else
				qur[i].di=1;
			qur[i].num=num[i];
		}
		
		sort(num+1,num+n+1);
		int k=1;
		for (i=2;i<=n;i++)
			if (num[i]!=num[i-1])
				num[++k]=num[i];
		build(1,1,k);
		
		for (i=1;i<=n;i++)
		{
			if (qur[i].di==0)
			{
				flag=1;
				updata(1,qur[i].num,0);
				if (!flag)
					printf("Wrong\n");
				else if (tree[1].data==0)
					printf("Empty\n");
				else if (flag==1)
				{
					double tmp;
					if (tree[1].data%2==1)
						tmp=cal(1,(tree[1].data+1)/2);
					else
					{
						double tmp1=cal(1,tree[1].data/2);
						double tmp2=cal(1,tree[1].data/2+1);
						tmp=(tmp1+tmp2)/2;
					}
					long long hh=trans(tmp);
					if(dnum==1)
						printf("%lld\n",ans);
					else	
						printf("%lld.%lld\n",tp,hh);
				}
		  }
			else
			{
				updata(1,qur[i].num,1);
				double tmp;
				if (tree[1].data%2==1)
					tmp=cal(1,(tree[1].data+1)/2);
				else
				{
					double tmp1=cal(1,tree[1].data/2);
					double tmp2=cal(1,tree[1].data/2+1);
					tmp=(tmp1+tmp2)/2;
				}
					long long hh=trans(tmp);
					if(dnum==1)
						printf("%lld\n",ans);
					else	
						printf("%lld.%lld\n",tp,hh);
			}
		}
	}
	return 0;
}