#include <iostream>
using namespace std;
int main(void){
    int a,b,max;
    cin >> a >> b;
    
    if(a+b>a*b && a+b>a-b)
        max=a+b;
    else if(a-b>a+b && a-b>a*b)
        max=a-b;
    else 
        max=a*b;
    
    cout << max << endl;
    return 0;
    
}
