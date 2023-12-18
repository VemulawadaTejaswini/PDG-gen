#include <iostream>

using namespace std;

int main()
{
    int n, k; cin >> n >> k;
    int initMinPoint = 0;
    int cnt = 0;

    int a[100010] = {0};

    for (int i = 1; i <= n; i++) {
        cin >> a[i];
        if (a[i] == 1) initMinPoint = i;
    }

    // initMinPointよりも前の部分の探索
    int bp = initMinPoint;
    while(bp > 1) {
        for (int i = 1; i <= (k - 1); i++) {
            if (bp - i >= 1) a[bp - i] = 1;
        }
        cnt++;
        bp -= k - 1;
    }

    // initMinPointよりも後ろの部分の探索
    int ap = initMinPoint;
    while(ap < n) {
        for (int i = 1; i <= (k - 1); i++) {
            if (ap - i <= n) a[ap - i] = 1;
        }
        cnt++;
        ap += k - 1;
    }

    cout << cnt << endl;

    return 0;
}