
#include <bits/stdc++.h>


using namespace std;
double pi=3.14159265358979323846264338;
long long sum;

int main(){
	string a,b;
	cin>>a>>b;
	int lnth,lnth2;
	int ans=1000000000;
	lnth=a.length();
	lnth2=b.length();
	for(int i=0;i<=lnth-lnth2;i++){
		int num=0;
		for(int j=0;j<lnth2;j++){
			if(a[i+j]!=b[j])num++;
		}
		ans=min(ans,num);
	}
	return 0;
}