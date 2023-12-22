#include <iostream>
#include <math.h>

using namespace std;

int calcDebt(int debt){
	double tmp = debt * 1.05;
	int result = (int) ceil(tmp);
	if(result % 1000 == 0){
		return result;
	}else{
		return (result / 1000 + 1) * 1000;
	}
}

int main(int argc, char *argv[]) {
	int result = 100000;
	int n;
	scanf("%d", &n);
	for(int i=0; i<n; i++){
		result = calcDebt(result);
	}
	printf("%d", result);
}