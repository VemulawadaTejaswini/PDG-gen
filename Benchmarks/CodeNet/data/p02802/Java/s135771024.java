#include "bits/stdc++.h"
using namespace std;
#define l long long;

int main(){
	std::ios::sync_with_stdio(false);
	int N;
	int M;

	vector<int> hash {N,0};
	vector<int> w {N,0};
	cin >> N >> M;
	int correctAns = 0;
	int penalty = 0;
	for(int x= 0;x<M;x++){
		int pX;
		cin >> pX;
		string s;
		cin >> s;
		if(s=="WA"){
			w[pX]--;
		}
		if(s=="AC" && hash[pX]==0){
			correctAns++;
			hash[pX]++;
			if(w[pX]<0){
				penalty-=w[pX];
			}
		}
	}
	cout << correctAns << " "<<abs(penalty);
}