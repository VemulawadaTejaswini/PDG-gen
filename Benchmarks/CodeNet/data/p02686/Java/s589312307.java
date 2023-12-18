#include <bits/stdc++.h>
#define ll long long int
#define ld long double
#define ull unsigned long long int
#define forn(i,n)for(ll i=0;i<(n);i++)
#define forn_rev(i,n)for(ll i=(n)-1;i>=0;i--)
#define for1n(i,n) for(ll i=1;i<=(n);i++)
#define ARRAY_SIZE(a) sizeof(a)/sizeof(*a)
#define MOD 1000000007
#define MAXN 100005

using namespace std;

bool s2cmp(const pair<ll,ll> &a,const pair<ll,ll> &b){
    return a.second>b.second;
}


int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(NULL); cout.tie(NULL);
    ll T=1;
    //cin>>T;
    while(T--)
    {


       ll N;
       cin>>N;
       vector<string> arr(N);
       forn(i,N) cin>>arr[i];
       vector<vector<ll>> dp(2,vector<ll>(N));
       forn(i,N){
            ll l=0,r=0;
            stack<char> st;
            forn(j,arr[i].length()){
                if(st.empty()){
                    st.push(arr[i][j]);
                }
                else if(st.top()=='(' && arr[i][j]==')'){
                    st.pop();
                }
                else{
                    st.push(arr[i][j]);
                }
            }
            while(!st.empty()){
                if(st.top()=='(') l++;
                else if(st.top()==')') r++;
                st.pop();
            }


            dp[0][i]=l;
            dp[1][i]=r;
       }
       vector<pair<ll,ll>> s1,s2;
       forn(i,N){
        if(dp[1][i]-dp[0][i]>=0){
            s1.push_back({dp[0][i],dp[1][i]});
        }
        else{
            s2.push_back({dp[0][i],dp[1][i]});
        }

       }
       sort(s1.begin(),s1.end());
       sort(s2.begin(),s2.end(),s2cmp);
       for(auto x:s2) s1.push_back(x);
       ll S=0;
       for(auto x:s1){
            S-=x.first;
            if(S<0){
                cout<<"No";
                return 0;
            }
            S+=x.second;
       }
       if(S==0) cout<<"Yes";
      else cout<<"No";







    }



    return 0;
}