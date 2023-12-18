#include <bits/stdc++.h>
using namespace std;
using ll=long long int;

int main (){
    map <string, int> mp;
    ll n;
    cin >> n;
    while (n--){
        string s;
        cin >> s;
        sort (s.begin(), s.end());
        mp[s]++;
    }

    ll count = 0;
    for (auto i = mp.begin(); i != mp.end(); i++){
        ll k = i->second; 
        count += (k)*(k - 1) /2;
    }
    cout << count << endl;
    return 0;
}

