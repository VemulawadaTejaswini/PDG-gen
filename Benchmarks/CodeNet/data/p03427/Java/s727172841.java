#include <iostream>

#

using namespace std;

int main() {
    long long a;
    cin >> a;
    if (a < 10) {
        cout << a << endl;
    } else {
        int flag = 0;
        if ((a + 1) % 10 == 0) {
            flag = 1;
        }
        int y;
        int count = 0;
        while (a > 9) {
            a /= 10;
            count++;
        }
        if (flag != 1) { y = a - 1; }
        else {
            y=a;
        }

        cout << 9 * count + y << endl;
    }

    return 0;
}