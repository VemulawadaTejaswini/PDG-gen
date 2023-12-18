#include <bits/stdc++.h>
using namespace std;
int main() {
  int N, M;
  cin >> N >> M;
  vector<int> T(N);
  for (int i = 0; i < N; i++) {cin >> T.at(i);}
  for (int i = 0; i < M; i++) {
    vector<int> t(N);
    for (int j = 0; j < N; j++) {t.at(j) = T.at(j);}
    int P, X, Y = 0;
    cin >> P >> X;
    t.at(P - 1) = X;
    for (int j = 0; j < N; j++) {Y += t.at(j);}
    cout << Y << endl;
  }
}