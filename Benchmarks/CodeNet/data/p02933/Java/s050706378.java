#include <iostream>
#include <cstdio>
#include <string>
using namespace std;

string s;
int arr;
int main(){
	scanf("%d",&arr);
	cin>>s;
	if(arr>=3200){
		cout <<s<<endl;
	}else{
		cout <<"red"<<endl;
	}
	return 0;
}