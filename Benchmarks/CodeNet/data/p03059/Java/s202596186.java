#include <iostream>
using namespace std;

int main(){
    int A, B, T;
    cin>>A>>B>>T;
    int t = A;
    int ans = 0;
    while(t < T+1){
        ans += B;
        t += A;
    }
    cout<<ans<<endl;
    return 0;
}