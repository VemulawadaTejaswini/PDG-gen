#include <bits/stdc++.h>
using namespace std;

int main() {
int a,b;
cin >> a >> b;
int count=0;
for(int i=a;i<=b;i++){
string s=to_string(i);
int flag=0;
for(int j=0;j<(int)(s.length())/2;j++){
if(s[j]!=s[(int)(s.length())-1-j])flag=1;

}
if(flag==0)count++;
flag=0;
}
cout << count;
}