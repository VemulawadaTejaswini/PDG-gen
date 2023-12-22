#include <iostream>
using namespace std;

bool check(int a, int b , int c){
	return ( a*a == ( b*b + c*c ) )? true : false ;
}

int main(){
	int n, a, b, c;

	cin >> n;
	for(int i=0 ; i<n ; i++){
		cin >> a >> b >> c;
		if( check(a,b,c) || check(b,c,a) || check(c,a,b) ){
			cout << "YES" << endl;
		}else{
			cout << "NO" << endl;
		}
	}
}