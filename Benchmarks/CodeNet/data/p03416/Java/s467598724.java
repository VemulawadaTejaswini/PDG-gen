#include <iostream>
#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <algorithm>
#include <string>
#include <sstream>
#include <complex>
#include <vector>
#include <list>
#include <queue>
#include <deque>
#include <stack>
#include <map>
#include <set>
typedef long long unsigned int ll;

#define EPS (1e-7)
#define INF (1e9)
#define PI (acos(-1))

using namespace std;
using Graph = vector<vector<int>>;

int main() {
int a,b;
cin >> a >> b;
int count=0;
for(int i=a;i<=b;i++){
string s=to_string(i);
int flag=0;
for(int j=0;j<(int)(s.length())/2;j++){
if(s[j]!=s[(int)(s.length())-1-j])flag=1;

}
if(flag==0)count++;
flag=0;
}
cout << count;
}