#include <iostream>
using namespace std;
int main(){
    int N;
    cin >> N;
    int onecount = 0;
    int totalcount = 0;
    for(int m = 1; m <= N; m=m+2){
        for(int i = 1; i <= m; i++){
            if(m%i == 0){
                onecount++;
            }
        }
        if(onecount == 8){
            totalcount++;
        }
        onecount = 0;
    }
    cout << totalcount << endl;
    return 0;
}