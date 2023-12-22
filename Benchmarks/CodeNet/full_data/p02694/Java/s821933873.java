#include<bits/stdc++.h>
using namespace std;
#define ll long long int
#define ld long double
int main()
{
ld n;
cin>>n;
ld x=100.0;
ll count=0;
while(x<n){
x=(x+(0.01*x));
ll p=x;
x=p;
count++;
}
cout<<count<<endl;
}