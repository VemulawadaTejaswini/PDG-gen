#include<bits/stdc++.h> 

using namespace std;
long long f(long long a) {
     long long res[] = {a,1,a+1,0};
     return res[a%4];
}

long long getXor(long long a, long long b) {
     return f(b)^f(a-1);
}
int main() 
{
	long long a, b ;
	cin >> a >> b;
	cout << getXor(a,b) << endl;
    return 0;
} 