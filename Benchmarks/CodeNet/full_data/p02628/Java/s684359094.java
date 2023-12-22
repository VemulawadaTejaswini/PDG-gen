#include <iostream>
#include<vector>
#include <algorithm>
using namespace std;

int main()
{ int n,k,v, c=0;
vector <int> A;
cin>> n;
cin >> k;
while (n){
    cin>> v;
        A.push_back(v);
            n--;

} sort(A.begin(), A.end());
for (int i =0; i< k; i++)
    c+= A[i];

cout<<c;

return 0;

}
