#include<cstdio>
#include<cstring>
#include<algorithm>
#include<vector>
using namespace std;
const int MAXN = 5000+5, MAXM = 20+5;
int T, N, d[2][MAXN];
int qur[MAXM], r[MAXM], ans[MAXM];
bool cmp(const int a, const int b)
{
    return qur[a] < qur[b];
}
int main()
{
    freopen("D.in", "r", stdin);
    for (T = 0; scanf("%d", &N) != EOF; T++)
    {
        qur[T] = N;
        r[T] = T;
    }
    sort(r, r+T, cmp);
    memset(d, 0, sizeof(d));
    d[0][0] = 1;
    int s = 1, t = 0;
    for (int i = 1, k = 0; i <= 10000 && k < T; i++)
    {
        swap(s, t);
        for (int j = 0; j <= i && j <= N-i+1; j++)
        {
            if (j)
                d[t][j] = d[s][j-1]+d[s][j]+d[s][j+1];
            else
                d[t][j] = d[s][j]+d[s][j+1];
        }
        for (; i == qur[r[k]]/2; k++)
        {
            int sum = 0;
            if (i%2)
            {
                for (int j = 0; j <= i; j++)
                {
                    if (j)
                        sum += d[t][j]*(d[t][j-1]+d[t][j]+d[t][j+1]);
                    else
                        sum += d[t][j]*(d[t][j]+d[t][j+1]);
                }
            }
            else
            {
                for (int j = 0; j <= i; j++)
                    sum += d[t][j]*d[t][j];
            }
            ans[r[k]] = sum;
        }
    }
    for (int i = 0; i < T; i++)
        printf("%d\n", ans[i]);
    return 0;
}