#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
const int N=(int)1e5;

int main() {
	ios_base::sync_with_stdio(0), cin.tie(0), cout.tie(0);
	string s,t;
	cin>>s>>t;
	int ans=t.length();
	for(int i=0;i+t.length()<=s.length();i++){
		int curr=0;
		for(int j=0;j<t.length();j++)
			if(s[i+j]!=t[j])
				curr++;
		ans=min(ans,curr);
	}
	cout<<ans<<"\n";

}
