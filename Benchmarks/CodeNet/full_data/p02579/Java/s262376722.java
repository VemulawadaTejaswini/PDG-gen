#include <bits/stdc++.h>
using namespace std;
int H,W,sx,sy,gx,gy,d[1000][1000];
string s[1000];
int INF=1<<30;
main()
{
    cin>>H>>W;
    cin>>sx>>sy;
    cin>>gx>>gy;
    --sx;--sy;--gx;--gy;
    for(int i=0;i<H;++i)cin>>s[i];
    for(int i=0;i<H;++i)for(int j=0;j<W;++j)d[i][j]=INF;
    d[sx][sy]=0;
    deque<pair<int,int>>q;
    q.push_back({sx,sy});
    while(!q.empty())
    {
        int x=q.front().first;
        int y=q.front().second;
        q.pop_front();
        for(int i=-2;i<=2;++i)for(int j=-2;j<=2;++j)
        {
            int nx=x+i;
            int ny=y+j;
            if(nx<0||ny<0||nx>=H||ny>=W||s[nx][ny]=='#')continue;
            if(abs(i)+abs(j)<=1&&d[nx][ny]>d[x][y])
            {
                d[nx][ny]=d[x][y];
            }else if(d[nx][ny]>d[x][y]+1)
            {
                d[nx][ny]=d[x][y]+1;
            }else continue;
            q.push_back({nx,ny});
        }
    }
    cout<<(d[gx][gy]==INF?-1:d[gx][gy])<<endl;
}