#include <bits/stdc++.h>
using namespace std;

using ll=long long;
#define int ll

#define FOR(i,a,b) for(int i=int(a);i<int(b);i++)
#define REP(i,b) FOR(i,0,b)

int read(){
  int i;
  scanf("%lld",&i);
  return i;
}

signed main(){
  while(true){
    int n=read();
    if(n==0) return 0;
    string s[n];
    int cnt[n];
    int cnt_max=0;
    // cin >> s[0];
    // FOR(i,1,n){
    REP(i, n){
      // int first,last;
      int last;
      cin >> s[i];
      // first = s[i].find_first_of('.');
      last = s[i].find_last_of('.');
      if (last == -1) {
        cnt[i] = -1;
        continue;
      }
      s[i][last] = '+';
      // cnt[i] = last-first;
      cnt[i] = last;
      cnt_max = max(cnt_max,cnt[i]);
    }
    FOR(j,0,cnt_max+1){
      // int first=0,last=0;
      FOR(i,1,n){
        if(cnt[i] == j){
          // if(first == 0) first = i;
          // else last = i;
          for (int k = i + 1; k < n; ++k) {
            if (cnt[k] < j) {
              break;
            }
            if (cnt[k] == j) {
              int first = i;
              int last = k;
              FOR (l, first + 1, last) {
                s[l][j] = '|';
              }
            }
          }
        }
      }
      // FOR(k,first+1,last){
      //   if(s[k].length() >= j) continue;
      //   if(s[k][j] == '.') s[k][j] = '|';
      // }
    }

    FOR(i,1,n){
      REP(j,cnt[i]){
        if(s[i][j] == '.') s[i][j] = ' ';
      }
    }
    REP(i,n) cout << s[i] << endl;
  }
}