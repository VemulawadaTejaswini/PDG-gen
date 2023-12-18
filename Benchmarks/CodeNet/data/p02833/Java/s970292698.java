#include<bits/stdc++.h>
#define rep(i, n) for(int i = 0; i < (n); i++)
using namespace std;
typedef long long ll;

ll g(ll n, ll p)
{
	if (n == 1 || n == 0)
		return 0;
	return n / p + g(n / p, p); 
}	

ll g2(ll n, ll p)
{
	ll res = g(n / 2, p);
	if (p == 2)
		res += n / 2;
	return res;
}

signed main()
{
  ll n, ans;

  cin >> n;
  if (n % 2 == 0)
	  ans = min(g2(n, 2), g2(n, 5));
  else
	  ans = 0;
  cout << ans << endl;
}
