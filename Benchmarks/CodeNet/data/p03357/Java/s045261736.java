#include <stdio.h>
#include <stdlib.h>
#include <algorithm>

#define MAX_N (2000)
#define SIZE_BUF (30)
#define INF (1000000000)

using namespace std;

void swap(int *as, char *cs, int i, int j) {
  const int a = as[i];
  const char c = cs[i];
  as[i] = as[j];
  cs[i] = cs[j];
  as[j] = a;
  cs[j] = c;
}

int main(int argc, char *argv[]) {
  // read inputs
  int N, as[2 * MAX_N];
  char cs[2 * MAX_N], buf[SIZE_BUF];
  scanf("%d", &N);
  fgets(buf, SIZE_BUF, stdin);
  for (int i = 0; i < 2 * N; i++) {
    scanf("%c %d", &cs[i], &as[i]);
    fgets(buf, SIZE_BUF, stdin);
  }

  // sort from the beginning
  int ans = 0;
  int nb = 1, nw = 1;
  // for (int i = 0; i < 2 * N; i++) {
  //   printf("%c %d\n", cs[i], as[i]);
  // }
  for (int i = 0; i < 2 * N; i++) {
    const char c0 = cs[i];
    const int n0 = c0 == 'B' ? nb : nw;
    if (as[i] > n0) {
      // look for n (B, nb) or (W, nw)
      int ib = INF, iw = INF;
      for (int j = i + 1; j < 2 * N; j++) {
        if (cs[j] == 'B' && as[j] == nb) {
          ib = j;
        }
        if (cs[j] == 'W' && as[j] == nw) {
          iw = j;
        }
      }
      // bring the nearer one to i
      for (int j = min(ib, iw); j > i; j--) {
        swap(as, cs, j, j - 1);
        ans++;
      }
    }
    if (cs[i] == 'B') {
      nb++;
    } else {
      nw++;
    }
  }
  // for (int i = 0; i < 2 * N; i++) {
  //   printf("%c %d\n", cs[i], as[i]);
  // }
  printf("%d\n", ans);

  return 0;
}
