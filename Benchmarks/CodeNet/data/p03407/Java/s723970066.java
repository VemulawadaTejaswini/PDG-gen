#include <stdio.h>

int main(void)
{
  int A, B, C;
  scanf("%d%d%d", &A, &B, &C);
  printf("%s\n", A+B >= C ? "Yes" : "No");
  return 0;
}
