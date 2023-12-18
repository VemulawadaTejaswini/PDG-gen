#include <algorithm>
#include <iostream>
#include <vector>

int main() {
  int k, t;
  std::cin >> k >> t;
  std::vector<int> a(t);
  for (int i = 0; i < t; i++) std::cin >> a[i];

  sort(a.begin(), a.end());
  std::cout << std::max(0, a[t - 1] - 1 - (k - a[t - 1])) << "\n";
}