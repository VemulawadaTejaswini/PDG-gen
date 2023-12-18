#include <iostream>
#include <queue>

using namespace std;


int main()
{
	int n;
	cin >> n;
	vector<int> left(n);
	vector<int> right(n);
	vector<int> m(n, -1);
	int ans = 1;

	for(int i=0; i<n; ++i)
		cin >> left[i];

	for(int i=0; i<n; ++i)
		cin >> right[i];
	
	for(int i=0; i<n; ++i){
		if(i == 0 || left[i] > left[i-1]) 
			m[i] = left[i];
	}

	for(int i=n-1; i>=0; --i){
		if(m[i]>right[i] && m[i]!=-1) return 0;

		
		if(m[i]==-1 && right[i]==right[i])
			ans *= min(right[i], left[i]);

		ans %= 1000000007;
	}

	cout << ans << endl;

	


	return 0;
}