#include <stdio.h>
int main(void){
  int w, n, a[31], tmp, x, y, i;
  for(i = 1; i < 31; i++)
    a[i] = i;
  scanf("%d\n%d\n", &w, &n);
  for(;n--;){
    scanf("%d,%d", &x, &y);
    tmp = a[x];
    a[x] = a[y];
    a[y] = tmp;
  }
  for(i = 1; i < w+1; i++)
    printf("%d\n", a[i]);
  return 0;
}