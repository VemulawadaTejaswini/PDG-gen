#include<iostream>
#include<string>
#include<iomanip>
#include<cmath>
#include<vector>
#include<algorithm>

using namespace std;

#define int long long
#define rep(i,n) for(int i = 0; i < (n); i++)
#define INF ((long long)1e18)
#define MOD ((int)1e9+7)
#define endl "\n"

#define yn(f) ((f)?"Yes":"No")
#define YN(f) ((f)?"YES":"NO")

#define MAX

signed main(){
	cin.tie(0);
	ios::sync_with_stdio(false);
	cout<<fixed<<setprecision(10);
	
	int A, B, C;
	
	cin>>A>>B>>C;
	
	cout<<min(min(A+B, B+C), C+A)<<endl;
	
	
	return 0;
}