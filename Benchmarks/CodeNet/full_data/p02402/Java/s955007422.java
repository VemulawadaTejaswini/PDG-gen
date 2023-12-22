#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<iostream>
using namespace std;


int main() {
	
	int a[10000];
	int size;


	cin >> size;

	cin >> a[0];

	int max = a[0];
	int min = a[0];
	long long sum = a[0];

	for (int i = 1; i < size; i++) {
		cin >> a[i];

		if (max < a[i])max = a[i];
		if (min > a[i])min = a[i];
		sum += a[i];
	}



	printf("%d %d %d\n", min, max, sum);



	


	//system("pause");
	return 0;
}
