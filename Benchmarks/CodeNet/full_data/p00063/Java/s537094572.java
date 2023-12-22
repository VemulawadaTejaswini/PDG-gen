#include<iostream>
#include<math.h>
#include<vector>
#include<algorithm>
#include<cstdio>
#include<string>
using namespace std;
 
int main()
{
    string s;
    int n, i;
    n = 0;
    while (cin>>s) {
        n++;
        for (i = 0; i < s.size()/2; i++) {
            if (s[i] != s[s.size()-i-1]) {
                n--;
                break;
            }
        }
    }
    cout<<n<<endl;
    return 0;
}
