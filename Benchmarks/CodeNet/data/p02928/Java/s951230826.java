#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
#define INF (ll)1000000007

int main()
{
    int N;
    ll K;
    cin >> N >> K;
    int A[N];
    for (int i = 0; i < N; i++)
    {
        cin >> A[i];
    }
    ll c = 0;
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
        {
            if (i != j)
            {
                if (A[j] > A[i])
                {
                    c++;
                }
            }
        }
    }
    ll count = 0;
    for (int i = N - 1; i >= 0; i--)
    {
        for (int j = i - 1; j >= 0; j--)
        {

            if (A[j] > A[i])
            {
                count++;
            }
        }
    }
    ll ans = 0;
    ll k = K;
    K = K * (K - 1)/2 % INF;
    ans = k * count % INF + K * c % INF;
    cout << ans % INF << endl;
}
