#include<iostream>
#include <algorithm>
#define syso(s) std::cout<<s<<endl;
#define sc(i) std::cin>>i;
using namespace std;
int main() {
	int a, b, c;
	int count = 0;
	sc(a)
	sc(b)
	sc(c)
	if (a == b) {
		count++;
	}
	if (b == c) {
		count++;
	}
	if (c == a) {
		count++;
	}
	if (count == 3) {
		count--;
	}
	syso(3-count)
	return 0;
}
