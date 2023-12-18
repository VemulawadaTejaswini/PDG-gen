#include <bits/stdc++.h>

using namespace std;

int A[101010];
int main(void){
	int N, K;
	scanf("%d %d", &N, &K);
	for(int i = 0; i < N;++i){
		scanf("%d", A + i);
	}

	printf("%d\n", (int)floor((double)N/(K-1)));
	return 0;
}