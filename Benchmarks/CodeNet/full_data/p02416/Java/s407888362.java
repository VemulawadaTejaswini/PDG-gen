#include <iostream>
#include <string>

using namespace std;

string s;

int main() {
    cout << s << endl;
    while(s != "0"){
        cin >> s;
        int ans = 0;
        for(int i = 0; i < s.size(); i++) {
            ans += s[i] - '0';
        }
        cout << ans <<endl;
    }
}
