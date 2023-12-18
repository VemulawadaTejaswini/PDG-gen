#include <bits/stdc++.h>
#define LL long long
	int n,k;
	int a[100];
	int ans[100001];
using namespace std;
void Solve()
{
	if(k<a[0]) {cout<<2;return;}
	for(int i=a[0];i<=k;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i-a[j]<0) break;
			if(ans[i-a[j]]==0) {ans[i]=1;break;}	
		}
	}
	cout<<((2-ans[k])==1)?"First":"Second";
}
int main()
{
	cin>>n>>k;
	for(int i=0;i<n;i++) cin>>a[i];
	sort(a,a+n);
	for(int i=0;i<=k;i++) ans[i]=0;
	Solve();
}
