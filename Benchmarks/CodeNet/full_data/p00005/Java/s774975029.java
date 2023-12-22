#include <iostream>
using namespace std;

long gcd(long a, long b) {
    if(b == 0) return(a);
    return(gcd(b, a % b));
}

long lcm(long m, long n) {
    if(m == 0 || n == 0) return(0);
    return((m * n) / gcd(m, n));
}

int main(void) {
    long a, b;
    while(scanf("%ld %ld", &a, &b) != EOF) {
        cout << gcd(a, b) << " " << lcm(a, b) << endl;
    }
    return(0);
}