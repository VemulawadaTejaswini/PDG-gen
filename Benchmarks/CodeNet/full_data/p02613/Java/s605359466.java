#include<iostream>
using namespace std;
int main()
  {
  int n;
string s;
cin>>n;
string s1="AC";
string s2="WA";
string s3="TLE";
string s4="RE";
  int count=0,j=0,k=0,g=0,m=0;
if(n>=1 && n<=100000){
    for(int i=1;i<=n;i++)
    {
      cin>>s;
      if(s1.compare(s))j++;
   else if(s2.compare(s))k++;
     else if(s3.compare(s))g++;
      else if(s4.compare(s))m++;
    }
    cout<<"AC x "<<j;
  cout<<"WA x "<<k;
     cout<<"TLE x "<<g;
    cout<<"RE x "<<m;
}
return 0;
} 
   