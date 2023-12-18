#include<cstdio>
#include<iomanip>
#include<cmath>
#include<cstring>
#include<algorithm>
#include<iostream>

using namespace std;

const int MAXN=1e5+10;
int a[MAXN];

int main()
{
	int n;
	scanf("%d",&n);
	int sum=n;
	for(int i=1;i<=n;i++) scanf("%d",&a[i]);
/*	for(int i=1;i<n;i++){
		for(int j=i+1;j<=n;j++){
			if (a[i]==a[j])
				sum-=2;
		}
	}*/
	sort(a+1,a+1+n);
	for(int i=n;i>=2;i--){
		if (a[i]==a[i-1]){
			sum-=2;
			i--;
		}
	}
	printf("%d\n",sum);
	return 0;
}