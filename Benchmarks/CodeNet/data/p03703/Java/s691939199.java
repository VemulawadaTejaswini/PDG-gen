// copied
#include <algorithm>
#include <iostream>
#include <vector>
#include <cstdio>
#include <map>
using namespace std;
typedef long long LL;
const int maxn = 2e5 + 100;
int n, k;
LL a[maxn], c[maxn*4];
map<LL, int> M;
vector<LL> V;
void Modify(int x, int s){
    for(; x <= n; x += x&(-x)) c[x] += s;
}
LL Query(int y){
    if(y <= 0) return 0;
    LL ans = 0;
    for(int x = y; x; x -= x&(-x)) ans += c[x];
    return ans;
}

int main()
{
    int x;
    scanf("%d %d", &n, &k);
    for(int i = 1; i <= n; i++) scanf("%d", &x), a[i] = x;
    LL sum = 0;
    for(int i = 1; i <= n; i++) {
        sum += a[i];
        sum -= k;
        V.push_back(sum);
    }
    sort(V.begin(), V.end());
    for(int i = 0; i < V.size(); i++) M[V[i]] = i+1;
    sum = 0;
    LL ans = 0;
    for(int i = 1; i <= n; i++){
        sum += a[i];
        sum -= k;
        ans += Query(M[sum]);
        if(sum >= 0) ans++;
        Modify(M[sum], 1);
    }
    cout<<ans<<endl;
}
