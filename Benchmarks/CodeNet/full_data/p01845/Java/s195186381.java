#include <iostream>
#include <cmath>
using namespace std;
 
int main(){
    while(1){
        int r0,w0,c,r;
        cin >> r0 >> w0 >> c >> r;
        if(r0==0) break;
 
        if(w0*c > r0){
            cout << (int)ceil((double)(w0*c-r0)/r) << endl;
        }else{
            cout << 0 << endl;
        }
    }
    return 0;
}
