#include <bits/stdc++.h>

using namespace std;

#define REP(i,a,b) for(int i=a;i<(int)b;i++)
#define rep(i,n) REP(i,0,n)

int N;
int S, A, C;
int const M = 256;
vector<int> I;
int R[M];

int calcR(int i) {
  if(i==0) { return R[0] = S; }
  return R[i] = (A*calcR(i-1)+C) % M;
}

inline int O(int i) { return (I[i]+R[i+1]) % M; }
int numofx[M];
inline double H() {
  double entropy = 0.;
  rep(i, M) {
    if(numofx[i]) {
      double e = (double)numofx[i]/N;
      entropy -= e * log(e);
    }
  }
  return entropy;
} 

int main() {
  
  typedef pair<int, int> Pii;
  typedef pair<int, Pii> Piii;
  while(cin >> N && N) {
    I.clear(); I.resize(N);
    rep(i, N) { cin >> I[i]; }
    
    double entropy = 1e60;
    Piii ans = Piii(1<<29, Pii(1<<29, 1<<29));
    for(S=0; S<=15; S++)
      for(A=0; A<=15; A++)
        for(C=0; C<=15; C++) {
          calcR(N);
          rep(i, M) numofx[i] = 0;
          rep(i, N) numofx[O(i)] ++;
          double r = H();
          if(entropy > r) {
            entropy = r;
            ans = Piii(S, Pii(A, C));
          }
          /*
          else if(entropy == r) {
            Piii a = Piii(S, Pii(A, C));
            ans = min(ans, a);
          }
          */
        }
    cout << ans.first << " "
         << ans.second.first << " "
         << ans.second.second << endl;
  }
  
  return 0;
}