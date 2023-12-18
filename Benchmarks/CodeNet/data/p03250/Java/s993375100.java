#include<iostream>
#include<string>
#include<vector>
#include<algorithm>
#include<functional>
#include<array>
#include<math.h>
using namespace std;

int main(int argc, char const *argv[])
{
    int N[3];
    cin >> N[0] >> N[1] >> N[2];
    sort(N, N+3, greater<int>());
    int ans = 10*N[0]+N[1]+N[2];
    std::cout << ans << '\n';
    return 0;
}

