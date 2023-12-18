#include <iostream>
#include <vector>
#include <deque>
#include <cmath>
#include <map>
#include <set>
#include <unordered_set>
#include <algorithm>
#include "iomanip"

using namespace std;

int main() {
    int k, s, count = 0;
    cin >> k >> s;
    for (int i = 0; i <= min(k, s); i++) {
        for (int j = 0; j <= min(s - j, k); j++) {
            for (int l = 0; l <= min(s - j - i, k); l++) {
                if (i + j + l == s) {
                    count++;
                }
            }
        }
    }
    cout << count;
    return 0;
}

