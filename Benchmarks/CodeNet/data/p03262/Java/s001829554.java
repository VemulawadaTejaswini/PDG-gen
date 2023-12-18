#include <iostream>
#include <utility>
#include <map>
#include <string>
#include <vector>
#include <algorithm>
#include <functional>
#include <array>
#include <math.h>
#include <sstream>
typedef long long ll;
using namespace std;

int gcd(int a, int b){
    if (a % b == 0)
        return b;
    gcd(b, a % b);
}

int lcm(int a, int b){
    int ans = a * b / gcd(a, b);
    return ans;
}

int main(int argc, char const *argv[])
{
    int n, x;
    std::cin >> n >> x;
    vector<int> a(n);
    for (int i = 0; i < n; i++) {
        std::cin >> a[i];
    }
    a.push_back(x);
    sort(a.begin(), a.end());
    vector<int> b(n);
    for (int i = 0; i < n; i++) {
        b[i] = a[i+1]-a[i];
    }
    sort(b.begin(), b.end());
    int ans = gcd(b[0], b[1]);
    for (int i = 2; i < n; i++) {
        ans = gcd(ans, b[i]);
    }
    std::cout << ans << std::endl;
    return 0;
}