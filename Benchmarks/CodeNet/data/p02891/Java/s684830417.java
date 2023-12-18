#include <bits/stdc++.h>
#define rep(i, n) for(int i=0;i<(n); i++)
#define sz(x) int(x.size())
using namespace std;
typedef long long ll;

int main(){
    string s;
    int k;
    ll ans1=0, ans2=0, left=0, right=0;
    char bgn = 0;
    cin >> s;
    cin >> k;

    bool b = true;
    for(int i = 0; i<sz(s)-1; i++){
        if(s.at(0)!=s.at(i+1)){b=false;}
    }

    if(b){
        long long lk = k;
        cout << sz(s)*lk/2 << endl;
        return 0;
    }

    while(!s.empty()){
        if((sz(s)>=2&&s.at(0)==s.at(sz(s)-1)&&bgn==0)||(sz(s)>=2&&bgn==s.at(0)&&bgn==s.at(sz(s)-1))){
            ans1 = ans1 + 2;
            left++; right++;
            s.erase(s.begin()); bgn = s.back(); s.pop_back();
           // cout << "type A " << s << endl;
            continue;
        }else if(bgn==s.at(0)){
            ans1++;
            left++;
            s.erase(s.begin());
          //  cout << "type B " << s << endl;

            continue;

        }else if(bgn==s.at(sz(s)-1)){
            ans1++;
            right++;
            s.pop_back();
          //  cout << "type C " << s << endl;

            continue;
        }else{
            break;
        }
    }

    ans1 = ans1 / 2;

    bgn=0;
    int temp = 0;

    while(!s.empty()){
        if(bgn==0){
            bgn=s.back(); temp++; s.pop_back();
        }else{
            if(bgn==s.back()){
                temp++; s.pop_back();
            }else{
                ans2 += temp / 2;
                bgn=s.back();
                s.pop_back();
                temp = 1;
            }
        }
    }

    ans2 += temp / 2;


   // cout << ans1 << " " << ans2 << endl;

    cout << ans2*k + ans1*(k-1) + left/2 + right/2 << endl;


    return 0;
}
