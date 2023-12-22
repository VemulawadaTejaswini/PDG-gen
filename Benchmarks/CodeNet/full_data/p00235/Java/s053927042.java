int n;
int t[22][22];

int solve(int idx){
  int res = 0;
  rep(i,n){
    if(t[idx][i] > 0){
      t[i][idx] = 0;
      res = max(res,t[idx][i]+solve(i));
    }
  }
  return res;
}

int main(void){
  while(cin>>n,n){
    memset(t,0,sizeof(t));

    int sum = 0;
    rep(i,n-1){
      int a,b,cost;
      cin>>a>>b>>cost;
      t[a-1][b-1] = t[b-1][a-1] = cost;
      sum += cost * 2;
    }

    rep(i,n){
      int cnt=0, idx;
      rep(j,n){
        if(t[i][j] > 0 || t[i][j] == -1){
          cnt++;
          idx = j;
        }
      }
      if(i != 0 && cnt == 1){
        sum -= 2 * t[i][idx];
        t[i][idx] = t[idx][i]= -1;
      }
    }

    cout<<sum-solve(0)<<endl;
  }

  return 0;
}