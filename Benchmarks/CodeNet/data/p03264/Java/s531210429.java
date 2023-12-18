//  abc108a.cpp
#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    int k;
    cin >> k;
    int odd = k/2;
    int even = k/2;
    
    if (k%2 != 0) {
        odd++;
    }
    cout << odd*even << endl;
}
