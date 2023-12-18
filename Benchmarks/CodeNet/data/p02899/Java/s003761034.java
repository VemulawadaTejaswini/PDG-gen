#include<iostream>
#include<map>
#include<string>
#include<vector>
#include<algorithm>
using namespace std;

int main(){
    int n;
    cin>>n;
    vector<int>a(n);
    map<int,int>b;
    for(int i=0;i<n;i++){
        cin>>a[i];
        b[a[i]]=i;
    }
    for(int i=0;i<n;i++){
        cout<<b[i+1]+1<<endl;
    }
    return 0;
}