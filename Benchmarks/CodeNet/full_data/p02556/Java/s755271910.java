#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef unsigned long long ull;
#define endl '\n'
#define all(x) (x).begin(),(x).end()
const int INF=1000000000+5;
const int N=2e5+5;
const ll oo=1e18+5;
const ll mod=998244353;

struct point{
	int x,y;
};

bool cmp(const point& a,const point& b){
	return a.x+a.y<b.x+b.y;
}

int main(){
	ios::sync_with_stdio(0); cin.tie(0);
	int n;
	cin>>n;
	vector<point> a(n);
	for(int i=0;i<n;++i){
		cin>>a[i].x>>a[i].y;
	}
	sort(all(a),cmp);
	cout<<abs(a[0].x-a.back().x)+abs(a[0].y-a.back().y);
	return 0;
}
