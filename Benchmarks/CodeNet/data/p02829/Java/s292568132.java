#include <iostream>
#include <algorithm>
#include <cmath>
#include <set>
#include <vector>
using namespace std;

int main () {
	int a, b;
	cin >> a >> b;
	int ans = 1;
	if(a == 1 || b == 1) ans = 2;
	if(a == 2 || b == 2) ans = 3;
	cout << ans;
	return 0;
}