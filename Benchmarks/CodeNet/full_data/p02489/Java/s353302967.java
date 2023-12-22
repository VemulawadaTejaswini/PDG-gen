#include <iostream>
int main() {
  int c, x;
  for (c=0; 1; ) {
    std::cin >> x;
    if (!x) break;
    std::cout << "Case " << ++c << ": " << x << std::endl;
  }
  return 0;
}