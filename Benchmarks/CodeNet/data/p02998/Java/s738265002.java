#include<bits/stdc++.h>
using namespace std;
typedef long long LL;
const int maxn=200+10;
int vis[maxn][maxn];
struct Node
{
    int x,y;
    Node(){}
    Node(int a,int b):x(a),y(b){}
};
vector<Node >G;
int main()
{
    int n,k;
    scanf("%d%d",&n,&k);
    if(n==0)
    {
         printf("-1\n");
        return 0;
    }
    int m=n-1;
    int sum=(m)*(m-1)/2;
    if(k>sum)
    {
        printf("-1\n");
        return 0;
    }
    for(int i=1;i<=m;i++)
    {
        G.push_back(Node(i,n));
    }

    int i=1,j=2;
    while(sum!=k)
    {
        sum--;
        G.push_back(Node(i,j));
        j++;
        if(j==m+1) i++,j=i+1;
    }

    printf("%d\n",G.size());
    for(int i=0;i<G.size();i++)
    {
        printf("%d %d\n",G[i].x,G[i].y);
    }
}
