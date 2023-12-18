#include<cstdio>
#include<iostream>
#define maxn 200010
using namespace std;
int n,a[maxn],mx,mxx;
int main(){
	scanf("%d",&n);
	for(int i=1;i<=n;i++)
		scanf("%d",&a[i]);
	mxx=n;
	for(int i=1;i<=n;i++)
		if(a[i]==mx+1)mx++;
	for(int i=n;i>=1;i--)
		if(a[i]==mxx)mxx--;
	printf("%d",min(n-mx,mxx));
	return 0;
} 