#include<iostream>
#include<string>
#include<cstring>
#include<map>
#include<algorithm>
#include<set>
#include<vector>
#include<cstdio>
#include<cmath>
#include<queue>
using namespace std;
typedef long long LL;

const int maxn = 2e3 + 5;
LL a[maxn];
LL b[maxn][maxn];
int main(){
    int n;
    LL x,sum = 1LL << 60LL;
    cin >> n >> x;
    for(int i = 1;i <= n;i++) cin >> a[i];
    for(int i = 1;i <= n;i++){
        b[i][0] = a[i];
        for(int k = 1;k <= n - 1;k++){
            int pos = i - k;
            if(pos <= 0) pos = n - abs(pos);
            b[i][k] = min(b[i][k - 1],a[pos]);
        }
    }
    for(int k = 0;k <= n - 1;k++){
        LL ans = 0;
        for(int i = 1;i <= n;i++){
            ans += b[i][k];
        }
        sum = min(sum,ans + x * k);
    }
    cout << sum << endl;
}