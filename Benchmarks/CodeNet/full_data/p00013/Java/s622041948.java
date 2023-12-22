#include <iostream>
using namespace std;

int main(){
    int cnt = 0;
    int sta;
    int train[10]={0};
    while(cin >> sta){
        if(sta == 0){
            cnt--;
            cout << train[cnt] << endl;
        }
        else {
            train[cnt] = sta;
            cnt++;
        }
    }
}