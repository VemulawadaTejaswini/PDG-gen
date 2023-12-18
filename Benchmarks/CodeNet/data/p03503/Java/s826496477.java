#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <algorithm>
#include <string>
#include <limits.h>
using namespace std;
typedef long long LL;

int shopdata[100][10];
int profitInfo[100][11];

int openPeriod[10];
int main()
{
	int N;
	cin >> N;
	for (int i = 0;i < N;i++) {
		for (int j = 0;j < 10;j++) {
			cin >> shopdata[i][j];
		}
	}
	for (int i = 0;i < N;i++) {
		for (int j = 0;j < 11;j++) {
			cin >> profitInfo[i][j];
		}
	}

	LL max = LLONG_MIN;
	for (int n = 1;n <= 1023;n++) {
		for (int k = 0;k < 10;k++) {
			openPeriod[k] = (n >> k) % 2;
		}//Generate every solution

		
		int collision[10] = { 0 };

		for (int i = 0;i < 10;i++) {//i is the period number
			if (openPeriod[i]) {
				for (int j = 0;j < N;j++) {
					if (shopdata[j][i])collision[j]++;
				}
			}
		}

		LL sum = 0;
		for (int i = 0;i < N;i++) {
			sum += profitInfo[i][collision[i]];
		}
		
		if (sum > max)max = sum;
	}
	cout << max;
	return 0;
}