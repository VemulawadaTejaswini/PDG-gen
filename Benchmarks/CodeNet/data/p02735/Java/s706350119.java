#include<bits/stdc++.h>
#define _LIBCPP_DEBUG 0
using namespace std;
typedef long long int ll;
ll MOD = 1e9 + 7;
int INF = 1 << 20;

vector<vector<char>> MAP(102,vector<char>(102,'0'));
int H,W;
int dfs(int row, int col, int cnt){

    if(MAP[row][col]=='0') return H+W-1;

    if(MAP[row][col]=='#') cnt++;

    if(row==H&&col==W){
        return cnt;
    }else{
        int migi,sita;
        migi = dfs(row, col+1, cnt);
        sita = dfs(row+1, col, cnt);
        return min(migi,sita);
    }



}

int main(void){


    cin>>H>>W;

    for (int i = 1; i <= H; ++i) {
        for (int j = 1; j <= W; ++j) {
            cin>>MAP[i][j];
        }
    }
    cout<<dfs(1,1,0)<<endl;

    return 0;
}
