#include <bits/stdc++.h>
typedef long long LL;
const int MAX = 1000;
using namespace std;

int tu[MAX+5][MAX+5],m,n;
int main(){
	int a,b,c;
	while(cin>>a>>b>>c){
		int m = c%b;
		int flag=0,sum=1;
		for(int  i=1; i<=100; ++i){
			sum=a*i;
			if(sum==m){
				flag=1;
				break;
			}
		}
		if(flag)cout<<"YES"<<endl;
		else cout<<"NO"<<endl;
		
	}
	return 0;	
}