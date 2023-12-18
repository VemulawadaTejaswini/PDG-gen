#include<bits/stdc++.h>
#define debug(x) cout << '>' << #x << ':' << x << endl;
typedef long long ll;
const int INF = 1<<29;

using namespace std;



int main()
{
	
	//freopen("input.txt","r",stdin);freopen("output.txt","w",stdout);
	//clock_t time_req;time_req = clock();  
	int n,m;cin>>n>>m;
	int count = 0;
	for(int i = 1 ; i<n;i++) count+=i;
	for(int i = 1 ; i<m;i++) count+=i;
	cout<<count;




	//time_req = clock()- time_req;cout << "Time Compexity:"<< (float)time_req/CLOCKS_PER_SEC << " seconds" << endl; 
	return 0;
}