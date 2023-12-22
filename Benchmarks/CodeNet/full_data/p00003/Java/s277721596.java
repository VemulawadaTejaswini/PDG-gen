#include <deque>
#include <iostream>
#include <algorithm>
 
int main()
{
using namespace std;
deque<int> edge;
int iedge[3];
int j;
int a,b,c;
 
cin >> j;
 
for(int l=0;l<j;l++){
for(int i=0;i<3;i++){
cin >> iedge[i];
edge.push_back(iedge[i]);
}
 
sort(edge.begin(),edge.end());
a = edge[0];
b = edge[1];
c = edge[2];
if(c*c == (a*a+b*b))cout << "YES\n";
else cout << "NO\n";

edge.clear();
}
 
return 0;
}