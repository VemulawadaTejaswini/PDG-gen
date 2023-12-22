#include <bits/stdc++.h>
#define FOR(i,a,b) for(int i=(a);i<(b);i++)
#define REP(i,n) FOR(i,0,n)

using namespace std;
int a=0;
vector<string>sts;
vector<int>ens;
int getnum(){
  if(sts[a]=="*"){
    int num=1;
    int pe=ens[a];
    a++;
    while(ens[a]==pe){
      num*=getnum();
    }
    a++;
    return num;
  }
    else if(sts[a]=="+"){
      int num=0;
      int pe=ens[a];
      a++;
      while(ens[a]==pe){
	num+=getnum();
      }
      a++;
      return num;
    }else{
      int num=stoi(sts[a]);
      a++;
      return num;
    }
}
int main()
{
  while(1){
    int n;cin>>n;
    if(!n)break;
    for(int i=0;i<n;++i){
      string st;cin>>st;
      int n=st.find_first_not_of(".");
      sts.push_back(st.substr(n));
      ens.push_back(n);
    }
    int ans=getnum();
    cout<<ans<<endl;

  }
  return 0;
}