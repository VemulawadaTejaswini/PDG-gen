#include<iostream>
#include<string>
#include<algorithm>
#include<vector>
#include<queue>
#include<map>
#include<math.h>
#include<iomanip>
#include<set>
#include<numeric>
#include<cstring>
#include<cstdio>
#include<functional>
#include<bitset>
#include<limits.h>
#include<cassert>
#include <fstream>
#include <time.h>
#include <iterator>


#define REP(i, n) for(int i = 0;i < n;i++)
#define REPR(i, n) for(int i = n;i >= 0;i--)
#define FOR(i, m, n) for(int i = m;i < n;i++)
#define FORR(i, m, n) for(int i = m;i >= n;i--)
#define SORT(v, n) sort(v, v+n);
#define VSORT(v) sort(v.begin(), v.end());
#define REVERSE(v,n) reverse(v,v+n);
#define VREVERSE(v) reverse(v.begin(), v.end());
#define ll long long
#define pb(a) push_back(a)
#define m0(x) memset(x,0,sizeof(x))
#define print(x) cout<<x<<endl;
#define pe(x) cout<<x<<" ";
#define lb(v,n) lower_bound(v.begin(), v.end(), n);
#define ub(v,n) upper_bound(v.begin(), v.end(), n);
#define int long long
#define all(x) (x).begin(), (x).end()

using namespace std;

int MOD = (ll)1000000000 + 7;
const ll INF = 1e17;
const double pi = acos(-1);
const double EPS = 1e-10;
typedef pair<int, int>P;
const int MAX = 200020;



int N, ga, sa, ba, gb, sb, bb;
int dp[4][5050];
vector<P>p;
bool cmp(const P& p1, const P& p2) {
	return (p1.second - p1.first) < (p2.second - p1.first);
}
signed main() {
	cin.tie(0);
	ios::sync_with_stdio(false);

	cin >> N >> ga>> sa>> ba>> gb>> sb>> bb;
	REP(i, 4) {
		REP(j, 5050)dp[i][j] = 0;
	}
	p.push_back({ ga,gb });
	p.push_back({ ba,bb });
	p.push_back({ sa,sb });
	sort(p.begin(), p.end(), cmp);
	REP(i, 3) {
		//pe(p[i].first)print(p[i].second);
	}//cout << endl;
	//全部Aの方が高い場合
	if (p[2].second - p[2].first <= 0) {
		int wei[3], val[3];
		REP(i, 3) {
			val[i] = p[i].first;
			wei[i] = p[i].second;
		}
		REP(i, 3) {
			REP(w, N + 1) {
				//pe(i)pe(w);
				//pe("val:")pe(val[i]);
				dp[i + 1][w] = max(dp[i + 1][w], dp[i][w]);
				if (w >= wei[i]) {
					//print(dp[i + 1][w - wei[i]]);
					dp[i + 1][w] = max(dp[i + 1][w], dp[i + 1][w - wei[i]] + val[i]);
				}
				//print(dp[i + 1][w]);
			}
		}
		print(dp[3][N]); return 0;
	}
	else if (p[0].second - p[0].first >= 0) {
		//print("allB");
		int wei[3], val[3];
		REP(i, 3) {
			wei[i] = p[i].first;
			val[i] = p[i].second;
		}
		REP(i, 3) {
			REP(w, N+1) {
				//pe(i)pe(w);
				//pe("val:")pe(val[i]);
				dp[i + 1][w] = max(dp[i + 1][w], dp[i][w]);
				if (w >= wei[i]) {
					//print(dp[i + 1][w - wei[i]]);
					dp[i + 1][w] = max(dp[i + 1][w], dp[i + 1][w - wei[i]] + val[i]);
				}
				//print(dp[i + 1][w]);
			}
		}
		print(dp[3][N]); return 0;
	}
	//Aでp[2]を変えるだけ
	else if (p[1].second <= p[1].first) {
		int cnt = N / p[2].first;
		N -= cnt * p[2].first;
		N += cnt * p[2].second;
		//print(N);
		int ans = 0;
		REP(i, N+1) {
			REP(j, N+1) {
				if (i*p[0].second + j * p[1].second > N)break;
				int res = i * p[0].first + j * p[1].first + N - (i*p[0].second + j * p[1].second);
				ans = max(ans, res);
			}
		}
		print(ans);
	}
	else {
		int N2 = N;
		REP(i, N+1) {
			REP(j, N+1) {
				if (i*p[1].first + j * p[2].first > N)break;
				int res = i * p[1].second + j * p[2].second + N - (i*p[1].first + j * p[2].first);
				N2 = max(N2, res);
			}
		}
		int cnt = N2 / p[0].second;
		N2 -= cnt * p[0].second;
		N2 += cnt * p[0].first;
		print(N2);
	}
}
