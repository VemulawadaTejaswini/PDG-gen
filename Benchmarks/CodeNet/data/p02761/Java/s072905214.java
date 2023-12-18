#include <bits/stdc++.h>

using namespace std;

int main(){
    int n, m;
    cin >> n >> m;
    vector<int> ass(n, 0);
    int x, y;
    for(int i = 0; i<m; i++){
        cin >> x >> y;
        ass[x-1] = y; 
    }
    if(ass[0] == 0)
        ass[0] = 1;
        
    a = ass.size(); 
    for(int i = 0; i<a; i++){
        cout<<ass[i];
    }
}