#include <stdio.h>

#define X 10000

int main() {
	int n = 0, a[10000], i, j, count = 0, flag = 0;
	scanf("%d", &n);
	for (i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}

	for (i = 0; i < n; i++) {
		for (j = 2; j <= (int)sqrt(a[i]); ++j) {
			if (a[i] % j == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			count++;
		}
		flag = 0;
	}

	printf("%d\n", count);

	return 0;
}
