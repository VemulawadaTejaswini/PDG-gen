#include <string>
#include <cmath>
#include <cstdio>
#include <vector>
#include <algorithm>
#include <iostream>
#include <queue>
#include <tuple>
#include <functional>
#include <set>

using namespace std;

int main()
{
	int n;
	int k;
	cin >> n >> k;
	int x = 1;
	for (int i = 0; i < n; ++i) {
		x = min(2 * x, x + k);
	}
	cout << x << endl;

}