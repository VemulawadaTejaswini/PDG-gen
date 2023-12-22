<details><summary>C++での解答例</summary><div>

```{B.cpp}
#include<bits/stdc++.h>
using namespace std;
int main(){
  int n,k;
  cin >> n >> k;
  vector<int> vec(n);
  for (int i = 0; i < n; i++){
    int p;
    cin >> p;
    vec.at(i) = p;
  }
  sort(vec.begin(),vec.end());
  int ans = 0;
  for (int i = 0; i < k; i++){
    ans += vec.at(i);
  }
  cout << ans << endl;
}

```

</div></details>