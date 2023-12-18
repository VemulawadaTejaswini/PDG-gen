#include "stdafx.h"
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
#include "stdafx.h"
using namespace std;

int main()
{
	int a, b, c;
	cin >> a >> b >> c;
	if (a == b) {
		cout << c << endl;
	}
	else if (a == c) {
		cout << b << endl;
	}
	else if (b == c) {
		cout << a << endl;
	}

    return 0;
}

