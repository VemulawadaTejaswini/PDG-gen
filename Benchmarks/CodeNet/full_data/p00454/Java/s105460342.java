#include <iostream>
#include <vector>
#include <math.h>
#include <stdio.h>
#include <algorithm>
#include <string>
#include <map>
#include <queue>
#include <memory.h>
using namespace std;
int dx[] = {1,0,-1,0};
int dy[] = {0,1,0,-1};

int W, H, N;
int X1[1000], X2[1000], Y1[1000], Y2[1000];

bool fld[1000 * 6][1000 * 6];

int compress(int *x1, int *x2, int w) {
  vector<int> xs;

  for(int i = 0; i < N; i++) {
    for(int d = -1; d <= 1; d++) {
      int tx1 = x1[i] + d, tx2 = x2[i] + d;
      if(0 <= tx1 && tx1 <= w) xs.push_back(tx1);
      if(0 <= tx2 && tx2 <= w) xs.push_back(tx2);
    }
  }
  sort(xs.begin(),xs.end());
  xs.erase(unique(xs.begin(),xs.end()),xs.end());

  for(int i = 0; i < N; i++) {
    x1[i] = find(xs.begin(),xs.end(),x1[i]) - xs.begin();
    x2[i] = find(xs.begin(),xs.end(),x2[i]) - xs.begin();
  }
  return xs.size();
}

void solve() {
  W = compress(X1,X2,W);
  H = compress(Y1,Y2,H);

  memset(fld,0,sizeof(fld));
  for(int i = 0; i < N; i++) {
    for(int y = Y1[i]; y <= Y2[i]; y++) {
      for(int x = X1[i]; x <= X2[i]; x++) {
        fld[y][x] = true;
      }
    }
  }


  int ans = 0;
  for(int y = 0; y < H; y++) {
    for(int x = 0; x < W; x++) {
      if(fld[y][x]) continue;
      ans++;

      queue<pair<int,int> > que;
      que.push(make_pair(x,y));
      while(!que.empty()) {
        int sx = que.front().first, sy = que.front().second;
        que.pop();

        for(int i = 0; i < 4; i++) {
          int tx = sx + dx[i], ty = sy + dy[i];
          if(tx < 0 || ty < 0 || tx >= W || ty >= H) continue;
          if(fld[ty][tx]) continue;
          que.push(make_pair(tx,ty));
          fld[ty][tx] = true;
        }
      }
    }
  }
  printf("%d\n",ans-1);
}


int main() {
  while(1) {
    scanf("%d %d",&W,&H);
    if(W == 0 && H == 0) break;
    W++;
    H++;
    scanf("%d",&N);
    for(int i = 0; i < N; i++) {
      scanf("%d %d %d %d",&X1[i],&Y1[i],&X2[i],&Y2[i]);
      X1[i]++;
      Y1[i]++;
      X2[i]++;
      Y2[i]++;
    }
    solve();
  }
}