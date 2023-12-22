#include<iostream>
#include<vector>
#include<string>
using namespace std;

char tisei[12][12];
void shima(int a, int b) {
	tisei[a][b] = 0;
	if (tisei[a - 1][b] &&  a - 1>0 )shima(a - 1, b);
	if (tisei[a + 1][b] &&  a + 1<13)shima(a + 1, b);
	if (tisei[a][b - 1] &&  b - 1>0 )shima(a, b - 1);
	if (tisei[a][b + 1] &&  b + 1<13)shima(a, b + 1);
}
int main() {
	while (1) {
		for (int a = 0; a < 12; a++) {
			string c;
			cin >> c;
			if (cin.fail())goto l;
			for (int b = 0; b < 12; b++) {
				tisei[a][b] = c[b] - 48;
			}
		}
		int s = 0;
		for (int e = 0; e < 12; e++) {
			for (int f = 0; f < 12; f++) {
				if (tisei[e][f]) { s++; shima(e, f); }
			}
		}
		cout << s << endl;
	}
l:;
}