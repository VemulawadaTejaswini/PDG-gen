#include<bits/stdc++.h>
using namespace std;

int main()
{
   string s1, s2, ans;
   int n1, n2;
   cin >> s1 >> s2 >> n1 >> n2 >> ans;
   if(ans == s1){
      n1--;
   }
   else{
      n2--;
   }
   cout << n1 << " " << n2 << endl;
   return 0;
}
