#include <stdio.h>
#include <math.h>

#define X 10000

int main() {
	int i, j, l, n, m, a[X], count = 0, flag=0;
	a[0] = 0;
	scanf("%d", &n);

	for (i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}

	for (i = 0; i < n; i++) {
		for (j = 2; j <= (int)(sqrt(a[i])); ++j) {
			if (a[i]%j==0) {
				flag = 1;
				break;
			}
		}
		if (flag==0) {
			count++;
		}
		flag = 0;
	}

	return 0;
}
