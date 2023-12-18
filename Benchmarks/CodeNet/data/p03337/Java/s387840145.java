#include<bits/stdc++.h>
using namespace std;
int main()
{

    int A[5],a,b;
    cin>>a>>b;
    int op1 = a+b;
    int op2 = a-b;
    int op3 = a*b;
    A[0]=op1;
    A[1]=op2;
    A[2]=op3;
    sort(A,A+3);
    cout<<A[2]<<endl;
}
