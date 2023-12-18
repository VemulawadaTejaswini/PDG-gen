#include <iostream>
 
using namespace std;
 
int main(){
    int x;
    cin >> x;
    if (x < 1000){
        cout << "ABC" << endl;
    } else if (x >= 1200){
        cout << "ARC" << endl;
    }
    return 0;
}