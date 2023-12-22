#include<iostream>
#include<vector>
#include<string>
using namespace std;

int main(){
while(1){
	int a,b;
	cin>>a>>b;
    if(a==0&&b==0)break;
    for(int c=0;c<a;c++){
	for(int d=0;d<b;d++){
	if((c+d)%2==0)cout<<'#';
	else cout<<'*';
	}
	cout<<endl;
	}
	cout<<endl;
}}