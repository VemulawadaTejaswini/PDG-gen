#include <iostream>
using namespace std;

int main(){
	int a, b, c;
	int countFive = 0;
	int countSeven = 0;
	cin >> a >> b >> c;
	if (a == 5) countFive++;
	if (a == 7) countSeven++;
	if (b == 5) countFive++;
	if (b== 7) countSeven++;
	if (c == 5) countFive++;
	if (c == 7) countSeven++;
	if (countFive == 2 && countSeven == 1) cout << "YES" << endl;
	else cout << "NO" << endl;
}