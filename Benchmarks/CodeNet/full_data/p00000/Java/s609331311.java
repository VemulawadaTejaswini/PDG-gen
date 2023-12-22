#include<iostream>
#include<stdio.h>
#include<string.h>
#include<math.h>
#include<algorithm>
using namespace std;
const double eps=1e-6;//邊セ蠎ヲ髯仙宛
const double inf=999999999.0;//豁」譌?ゥキ
const int size=1010;
struct node
{
    int x,y;
    int id;
}p[size][2*size];

/*謚頑オョ轤ケp逧??霓ャ蛹紋クコ0,1謌?1  (邊セ蠎ヲ隶ィ隶コ)
int dblcmp(double p)
{
    if(fabs(p)<eps)
        return 0;
    return p>0?1:-1;    
}
*/
/*蜿臥ァッ霑千ョ?/
int mult(int x1,int y1,int x2,int y2)
{
    return ((double)x1*y2-(double)x2*y1)>0?1:-1;
}
/*隶。邂猶轤ケ蝨ィAB逧?キヲ萓ァ(螟ァ莠?)霑俶弍蜿ウ萓ァ?亥ー丈コ??会シ?P荳拶B逧?楴譌句?邉サ??/
int cross(node A,node B,node P)
{
    return mult(B.x-A.x, B.y-A.y, P.x-A.x, P.y-A.y);
}
int n,m,t;
int quad(node a)// 蛻、譁ュ雎。髯千噪蜃ス謨ー?梧ッ丈クェ雎。髯仙桁諡ャ蜊贋クェ蝮先?霓エ,p[n][n]荳コ蜴溽せ 
{
	int x=p[n][n].x,y=p[n][n].y;
	if( a.x>x && a.y>=y) 
		return 1;
	if( a.x<=x && a.y>y ) 
		return 2;
	if( a.x<x && a.y<=y ) 
		return 3;
	if( a.x>=x && a.y<y ) 
		return 4;
} 
bool cmp(node a,node b)  //0蛻ー360蠎ヲ?悟叉雎。髯?,2,3,4 
{  
	if(a.x==p[n][n].x&&a.y==p[n][n].y)
			return 1;
	if(b.x==p[n][n].x&&b.y==p[n][n].y)
			return 0;
	int l1,l2;
	l1 = quad(a); l2 = quad(b);
	if( l1 == l2 )
	{
		int c = cross(p[n][n],a,b);
		if(c>0)
			return 1;
		else if(c==0)
			return fabs(a.x)-fabs(b.x)<0;
		else
			return 0;
	}
	return l1 < l2;
} 
int ls[size][size],pos[size][size];
int cs(int a,int b,int c)
{
	int tmp,tb=pos[a][b],tc=pos[a][c];
	if(tc>tb)
	{
		tmp=tc-tb-1;
		return tmp;
	}	
	else
	{	
		tmp=tc-1+n-1-tb;
		return tmp;
	}
}
int main()
{
	int i,j,k;
	cin>>t;
	for(int cas=1;cas<=t;cas++)
	{
		cin>>n;
		for(i=0;i<n;i++)
		{
			scanf("%d%d",&p[n][i].x,&p[n][i].y);
			for(j=0;j<n;j++)
			{
				p[j][i]=p[n][i];
				p[j][i].id=i;
			}
		}
		for(i=0;i<n;i++)
		{
			p[n][n].x=p[n][i].x;
			p[n][n].y=p[n][i].y;
			sort(p[i],p[i]+n,cmp);	
			for(j=1;j<n;j++)
				p[i][j+n-1]=p[i][j];
		}
		for(i=0;i<n;i++)
		{
			for(j=1;j<n;j++)
			{
				pos[i][p[i][j].id]=j;
				int l=j+1,r=n-1+j-1,mid;
				while(l<r)
				{
					mid=(l+r)>>1;
					if(cross(p[i][0],p[i][j],p[i][mid])>0)
						l=mid+1;
					else
						r=mid;		
				} 	
				if(cross(p[i][0],p[i][j],p[i][l])<0)
				{
					ls[p[i][0].id][p[i][j].id]= l-(j+1);		
				}
				else
					ls[p[i][0].id][p[i][j].id]= n-2;
			}	
		}
		printf("Case %d:\n",cas);	
		cin>>m;
		int qa,qb,qc,t1,t2,t3,ans,tmp;
		for(i=0;i<m;i++)
		{
			scanf("%d%d%d",&t1,&t2,&t3);
			qa=t1;
			if(cross(p[n][qa],p[n][t2],p[n][t3])>0)
			{
				qb=t2;
				qc=t3;	
			}	
			else
			{
				qb=t3;
				qc=t2;	
			}
			tmp=ls[qa][qb]+ls[qb][qc]+ls[qc][qa];
			tmp=tmp-cs(qa,qb,qc)-cs(qb,qc,qa)-cs(qc,qa,qb);
			ans=n-tmp;
			printf("%d\n",ans);
		}
	}
	//system("pause");
	return 0;	
}