//============================================================================
// Name        : JOI.cpp
// Author      :
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
char chr;
int W,H,N;
int X[10001],Y[10001];
int main() {
	cin>>W>>H>>N;

	for(int i=0;i<N;i++){
		cin>>X[i]>>Y[i];
	}
	int S=0;
	int R=0;
	for(int i=0;i<N-1;i++){
		if(X[i]==X[i+1])S=fabs(Y[i+1]-Y[i]);
		if(Y[i]==Y[i+1])S=fabs(X[i+1]-X[i]);
		if((X[i]-X[i+1])*(Y[i]-Y[i+1])>0)S=max(fabs(X[i+1]-X[i]),fabs(Y[i+1]-Y[i]));
		if((X[i]-X[i+1])*(Y[i]-Y[i+1])<0)S=fabs(X[i+1]-X[i])+fabs(Y[i+1]-Y[i]);

		R+=S;

	}


	cout<<R<<endl;
	return 0;
}