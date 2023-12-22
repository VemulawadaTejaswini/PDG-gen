#include<iostream>
#include<cstdio>
#include<cstring>
#include<cmath>
#include<algorithm>
#include<map>

using namespace std;
int pri[20],cnt;
map<int,int> prime;
map<int,int> yin;

int d[128][1024][1<<6];

void handle(int m)
{
    int i,j,s,n,flag;
    cnt=0;
    n=m;

    for(i=2;i<=m;i++)
    {
        flag=0;
        for(j=2;j<=sqrt(i);j++)
        {
            if(i%j==0)
            {
                flag=1;
                break;
            }
        }
        if(!flag)
            pri[cnt++]=i;
    }

    for(i=0;i<cnt;i++)
    {
        if(n%pri[i]==0)
        {
            int s=0;
            while(n%pri[i]==0)
            {
                n/=pri[i];
                s++;
            }
            prime[pri[i]]=s;
        }
    }
    for(i=1;i<=m;i++)
    {
        int ss=0,num=i;
        if(m%num==0)
        {
            for(j=0;j<cnt;j++)
            {
                if(num%pri[j]==0)
                {
                    int s=0;
                    while(num%pri[j]==0)
                    {
                        num/=pri[j];
                        s++;
                    }
                    if(s==prime[pri[j]])
                    {
                        ss+=1<<j;
                    }
                }
            }
            yin[i]=ss;
        }
    }
}
int main()
{
    freopen("in.txt", "r", stdin);
    int N, M, K;
    while(scanf("%d%d%d",&N,&M,&K)!=EOF)
    {
        prime.clear();
        yin.clear();
        handle(M);
//        for(int i=0;i<cnt;i++)
//            printf("%d ",prime[pri[i]]);
//        printf("\n");
//        for(int i=1;i<=M;i++)
//            if(M%i==0)
//            {
//                printf("%d ",yin[i]);
//            }
        int tot = (1<<cnt)-1;
        memset(d, 0, sizeof(d));
        d[0][0][0] = 1;
        for (int i = 0; i < K; i++)
            for (int j = 0; j < N; j++)
                for (int k = 0; k < tot; k++)
                {
                    for (map<int, int>::iterator it = yin.begin(); it != yin.end(); it++)
                    {
                        if (j+it->first > N) continue;
                        d[i+1][j+it->first][k|it->second] += d[i][j][k];
                    }
                }
        printf("%d\n", d[K][N][tot]+1);
    }
    return 0;
}