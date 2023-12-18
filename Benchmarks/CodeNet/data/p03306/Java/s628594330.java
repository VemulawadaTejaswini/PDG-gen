#include<iostream>
#include<cstdio>
#include<cstdlib>
#include<cstring>
#include<algorithm>
#define Max 100001
#define inf 0x3f3f3f3f
using namespace std;
int n,m;
int first[Max * 2],next[Max * 2],u[Max * 2],v[Max * 2],s[Max * 2],vis[2][Max],num[Max];
int flag,l,r = inf;
void dfs(int from,int tag,int va) {
    if(flag)return;
    int k = first[from];
    while(k != -1) {
        if(flag)return;
        int vtag = (tag == 1);
        int to = v[k];
        int lva = s[k] - va;
        if(vis[vtag][to] != inf) {
            if(vis[vtag][to] == lva) {
                k = next[k];
                continue;
            }
            else {
                flag = 1;
                return;
            }
        }
        vis[vtag][to] = lva;
        if(vtag)r = min(r,lva);
        else l = max(l,-lva);///
        dfs(to,-tag,lva);
        k = next[k];
    }
}
int main() {
    scanf("%d%d",&n,&m);
    memset(first,-1,sizeof(first));
    memset(vis,inf,sizeof(vis));
    for(int i = 0;i < m;i ++) {
        scanf("%d%d%d",&u[i],&v[i],&s[i]);
        num[u[i]] ++;
        num[v[i]] ++;
        u[i + m] = v[i];
        v[i + m] = u[i];
        s[i + m] = s[i];
        next[i] = first[u[i]];
        first[u[i]] = i;
        next[i + m] = first[u[i + m]];
        first[u[i + m]] = i + m;
    }
    dfs(1,1,0);
    if(flag)printf("0");
    else
    {
        printf("%d",r - l - 1);
    }
    return 0;
}
