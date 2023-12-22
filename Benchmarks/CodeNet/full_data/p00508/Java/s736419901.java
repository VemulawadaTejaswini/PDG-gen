#include <iostream>
#include <vector>
#include <math.h>
#include <stdio.h>
#include <algorithm>

using namespace std;
typedef pair<int,int> P;
int N;
P A[500000];
bool compare_y(P a, P b) {
  return a.second < b.second;
}

int closest_pair(P *a ,int n) {
  if(n <= 1) return 2 << 27;
  int m = n /2;
  int x = a[m].first;
  int d = min(closest_pair(a,m),closest_pair(a + m, n - m));
  inplace_merge(a, a + m, a + n, compare_y);

  vector<P> b;
  for(int i = 0; i < n; i++) {
    if(abs(a[i].first - x) >= d) continue;
    for(int j = 0; j < b.size(); j++) {
      int dx = a[i].first - b[b.size() - j - 1].first;
      int dy = a[i].second - b[b.size() - j - 1].second;
      if(dy >= d) break;
      d = min(d,(dx * dx + dy * dy));
    }
    b.push_back(a[i]);
  }
  return d;
}

void solve() {
  sort(A,A + N);
  printf("%d\n", closest_pair(A,N));
}

int main() {
  cin >> N;
  for(int i = 0; i < N; i++) {
    int x, y;
    cin >> x;
    cin >> y;
    A[i] = P(x,y);
  }
  solve();

}