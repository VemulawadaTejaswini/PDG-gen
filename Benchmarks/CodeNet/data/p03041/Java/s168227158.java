#include<iostream>
#include<string.h>
using namespace std;
int main()
{
    int n,j;
    cin>>n;
    string s;
    cin>>s;
    j=strlen(s);
    j=j-1;
    for(int i=0;i<=j;i++){
        s[i]=s[i]+n;

}
cout<<j;
return 0;
}