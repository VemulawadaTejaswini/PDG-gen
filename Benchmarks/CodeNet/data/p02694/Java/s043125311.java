<bits/stdc++.h>
using namespace std;
rep(i, n) for (int i = 0; i < (int)(n); i++)
 
int main() {
 int X;
 int Y;
 int Z;
 int C;
 cin >> X;
 Y = X - 100;
 while( Y > Z ){
	X += X * 0.01;
	Z = X + Z;
	C += 1;
 }
 cout << C << endl;
}