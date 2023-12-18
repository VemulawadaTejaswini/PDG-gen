#include <stdio.h>
#include <string>
#include <vector>
#include <stdlib.h>
#include <iostream>

int main(int argc, char** argv) {
    int n;
    std::cin >> n;
    int spent = n * 800;
    int tmpn = n;
    int discountFactor = 0;
    while (tmpn > 15){
        tmpn /= 15;
        discountFactor++;
    }
    std::cout << spent - 200*discountFactor << std::endl;
    return 0;
}
