#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef pair<int, int> P;
#define rep(i, n) for (int i = 0; i < (int)(n); ++i)
template <class T> inline bool chmin(T &a, T b) {if (a > b){a = b;return true;}return false;}
template <class T> inline bool chmax(T &a, T b) {if (a < b){a = b;return true;}return false;}

int n;
int l[10];
int a, b, c;
int aans = 1e9;

void cnt(vector<int> v){
    int A=0, B=0, C=0;
    int aa=0,bb=0,cc=0;
    for(int i=0; i<v.size(); i++){
        if(v[i]==0) continue;
        if(v[i]==1) {
            A+=l[i];
            aa++;
        }
        if(v[i]==2){
            B+=l[i];
            bb++;
        } 
        if(v[i]==3) {
            C+=l[i];
            cc++;
        }
    }
    if(A==0 || B==0 || C == 0) return;
    int ans = abs(A-a) + abs(B-b) + abs(C-c) + (aa+bb+cc-3)*10;
    aans = min(ans, aans);
}

void dfs(int depth, vector<int> v){
    if(depth == n) {
        cnt(v);
        return;
    }
    for(int i=0; i<4; i++){
        v[depth] = i;
        dfs(depth+1, v);
    }
}

int main(){
    cin.tie(0);
    ios::sync_with_stdio(false);
    cin>>n>>a>>b>>c;
    rep(i, n){
        cin >> l[i];
    }
    vector<int> tmp(n+10, 0);
    dfs(0,tmp);
    // dfsして状態全列挙
    cout<<aans<<endl;

}