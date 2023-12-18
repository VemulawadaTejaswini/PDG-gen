#include<iostream>
using namespace std;
 
int main(void) {
    int result = 0;
    int n;
    cin >> n;
    char strs[n][10];
    for(int i = 0; i < n; i++) {
        cin >> strs[i];
    }
    
    int count[n][26];
    for(int i = 0; i < n; i++){
        for(int j = 0; j < 26; j++) {
            count[i][j] = 0;
        }
    }
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < 10; j++){
            count[i][strs[i][j] - 'a']++;
        }

    }
    bool flg = true;
    for(int i = 0; i < n - 1; i++) {
        for(int j = i + 1; j < n; j++) {
            for(int k = 0; k < 26 && flg; k++) {
                if(count[i][k] != count[j][k] && flg) {
                    flg = false;
                }
            }
            if(flg) {
                result++;
            }
            flg = true;
        }
    }
    cout << result << endl;
    return 0;
}