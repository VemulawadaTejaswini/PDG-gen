#include <iostream>
#include <cstdio>
#include <algorithm>
#include <vector>
#include <stack>
#include <queue>
#include <list>
#include <map>
#include <set>
#include <string>
#include <cstring>
#include <sstream>
#include <cmath>
#include <functional>
#include <fstream>
#include <cstdlib>
typedef long long ll;
const ll MOD = 1e9+7;


#define REP(i, N) for (ll i = 0; i < (N); i++)
#define REPP(i, a, b) for (ll i = (a); i < (b); i++)
#define ALL(v) (v).begin(), (v).end()
#define RALL(v) (v).rbegin(), (v).rend()
#define VSORT(c) sort((c).begin(),(c).end())
#define SZ(x) ((ll)(x).size())
//vvintを作る　マクロで　 #define vvint(N,M) vector<vector<ll>>

using namespace std;
bool cmp(pair<int,int> a , pair<int,int> b){
    if(a.first == b.first){
        return a.second > b.second;
    }
    return a.first < b.first;
}


int main(){
    
    cin.tie(0);
    ios::sync_with_stdio(false);

    int n,m;
    cin >> n >> m;
    vector<pair<int,int> > o;
    for(ll i = 0; i < m;i++){
        int a,b;
        cin >> a >> b;
        o.push_back(make_pair(a,b));
    }
    ll ans = 1;
    sort(ALL(o),cmp);
    int r = o[0].second;
    for(ll i = 0; i < m;i++){
        if(r <= o[i].first){
            ans++;
            r = o[i].second;
        }else{
            r = min(r,o[i].second);
        }
    }
    cout << ans << endl;

    return 0;
}