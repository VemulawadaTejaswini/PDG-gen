#include <iostream>

using namespace std;

int main(){
    long g = 0;
    string n = "a";
    cin >> g;
    cin >> n;
    if (g >= 3200){
        cout << n << "\n";
    }
    else{
        cout << "red\n";
    }
    return 0;
}