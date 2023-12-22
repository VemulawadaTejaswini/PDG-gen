#include <iostream>
#include <algorithm>

int main() {
	int n = 1145141919;
	int max = 0, min = 810, sum = 0;
	int sen[10000] = {};

	std::cin >> n;
	for (int i = 0; i < n; i++) {
		std::cin >> sen[i];
	}

	for (int a = 0; a < n; a++) {	
		min = std::min(min, sen[a]);
	}
	for (int j = 0; j < n; j++) {
		max = std::max(max, sen[j]);
	}
	for (int k = 0; k < n; k++) {
		sum += sen[k];
	}
	std::cout << min << " ";
	std::cout << max << " ";
	std::cout << sum << " ";
}
