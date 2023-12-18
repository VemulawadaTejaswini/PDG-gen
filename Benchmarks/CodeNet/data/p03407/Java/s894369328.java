#include <cstdio>
#include <cstring>
#include <iostream>
#include <algorithm>
using namespace std;
#define let const auto
#define rep(i,n) for(int i=0; i<(n); ++i)
#define reps(i,f,n) for(int i=(f); i<=(n); ++i)
#define outl(x) cout<< (x) << '\n'

int main()
{
   cin.tie(0), ios::sync_with_stdio(false);
   int a, b, c;
   cin >> a >>b >> c;

   outl( (a+b >= c)? "Yes" : "No");

}

