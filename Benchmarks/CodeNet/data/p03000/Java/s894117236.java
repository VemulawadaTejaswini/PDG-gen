/*
	submission # - User: herp_sy
	https://atcoder.jp/contests/
*/

#include <bits/stdc++.h>
using namespace std;

// utility of stdin,stdout
#define OUT cout << 
#define BR << endl
#define RET return 0
#define TLong long long

int main(int argc, char const *argv[]){
	int n,x;
	int cnt = 0;
	cin >> n >> x;
	std::vector<int> d(n + 3),l(n + 3);
	d.at(1) = 0;

	for (int i = 1; i <= n + 1; ++i)	cin >> l.at(i);
	for (int i = 1; i <= n + 1; ++i)
	{
		if(i >= 2)  d.at(i) = d.at(i - 1) + l.at(i - 1);
		if(d.at(i) <= x)	++cnt;
	}
	OUT(cnt) BR;
	RET;
}
