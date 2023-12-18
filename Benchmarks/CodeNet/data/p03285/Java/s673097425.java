#include<iostream>
#include<cmath>
#include<algorithm>
#include<vector>
#include<cstring>
using namespace std;

int main()
{
	int n;
	cin >> n;
	for (int i = 0; i < 30; i++) {
		for (int j = 0; j < 20; j++) {
			if (4 * i + 7 * j == n) {
				cout << "Yes" << endl;
				return 0;
			}
		}
	}
	cout << "No" << endl;
}