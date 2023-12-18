#include<iostream>
#include<algorithm>
#include<cmath>
using namespace std;

int main(){
	
	long long int year1,year2;
	cin>>year1>>year2;
	
	int min=2020;
	//2000 5000
	//2020 4040
	//4038
	if(year2-year1>=2019){
		min=0;
	}else{
		for(long long int i=year1;i<=year2;i++){
			for(long long int j=year1+1;j<=year2;j++){
				int s;
				s=(i%2019)*(j%2019)%2019;
				if(s<min){
					min=s;
				}
			}
		}
	}
	cout<<min<<endl;
	return 0;
}




