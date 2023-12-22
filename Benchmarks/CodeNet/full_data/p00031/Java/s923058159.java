#include <cstdio>
#include <iostream>
#include <sstream>
#include <algorithm>
#include <vector>
#include <string>
#include <map>
#include <set>

using namespace std;

#define rep(i,a,n) for(int (i)=a;(i)<(int)(n);(i)++)
#define rrep(i,a,n) for(int (i)=(n)-1;(i)>=a;(i)--)
#define all(x) (x).begin(),(x).end()

typedef long long ll;

const int INF = 1e9;

int main() {
    int n;
	while (scanf("%d", &n) != EOF) {
		vector<int> list;
		int x = 512;
		while (n > 0) {
			if (n >= x) {
				list.push_back(x);
				n -= x;
			}
			x >>= 1;
		}
		reverse(all(list));
		for (int i = 0; i < list.size(); i++) {
			if (i > 0) cout << " ";
			cout << list[i];
		}
		cout << endl;
	}
}