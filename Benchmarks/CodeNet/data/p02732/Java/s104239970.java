#include <bits/stdc++.h>
using namespace std;

vector<int> num(200001);
vector<int> a(200001);
int main() {
	int n;
	cin >> n;
	long long result = 0;
	for (int i = 0, x; i < n; i++) {
		cin >> x;
		a[i] = x;
		num[x]++;
		result += num[x] - 1;
	}
	for (int i = 0; i < n; i++) {
		cout << result - num[a[i]] + 1 << endl;
	}
}
