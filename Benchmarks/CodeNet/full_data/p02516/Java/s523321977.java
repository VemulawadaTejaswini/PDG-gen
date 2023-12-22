#include<iostream>
#include<cstdio>
#include<cmath>
#include<climits>
#include<ctime>
#include<cstdlib>
#include<vector>
#include<algorithm>
#include<cassert>
using namespace std;
#define REP(i,b,n) for(int i=b;i<n;i++)
#define rep(i,n)   REP(i,0,n)
#define pb push_back
#define mp make_pair
#define ALL(C) (C).begin(),(C).end()
#define fi first
#define se second

typedef long long ll;

const int N = 30000;
const int M = 30000;

class st{
public:
  double x,y;
  bool operator<(const st & a)const{
    return y < a.y;
  }
};

st in[N];

int num[N];//num of chips in range
int l[M],r[M];

bool islower_line(double x,double y,double a,double b){
  return y < a*x+b;
}

void put_xy(int m,int w,int n){
  int now=0;
  rep(i,n){
    while(now +1 < m && !islower_line(in[i].x,in[i].y,
				      (r[now]-l[now])/(double)w,
				      l[now]))now++;
    num[now]++;
  }
  //rep(i,m)cout << num[i]<< " " ;cout << endl;
  return;
}

int solve(int m,ll s,int w){
  int ret=0,now=0;
  int head=0,tail=0;
  int lbase=0,rbase=0;
  while(true){
    //back++
    while(tail < m){
      if ((ll)w*(ll)(l[tail]-lbase+r[tail]-rbase) > 2*s)break;
      now+=num[tail];
      tail++;
    }
    ret=max(ret,now);
    if (tail == m)break;
    //head++;
    head++;
    lbase=l[head-1];
    rbase=r[head-1];
    now-=num[head-1];
  }
  return ret;
}

int main(){
  int n,m,w,h;
  ll s;
  ll maxs=0;
  int maxh=0,maxw=0,maxhw=0;
  while(scanf("%d%d%d%d%lld",&n,&m,&w,&h,&s) != EOF){
    maxs=max(maxs,s);
    maxhw=max(maxhw,h*w);
    maxh=max(h,maxh);
    maxw=max(w,maxw);
    if (n==0&&m==0&&w==0&&h==0&&s==0)break;
    rep(i,m)num[i]=0;
    rep(i,m)scanf("%d%d",&l[i],&r[i]);
    rep(i,n){
      double x,y;
      scanf("%lf%lf",&in[i].x,&in[i].y);
    }
    sort(in,in+n);
    put_xy(m,w,n);
    s=(ll)w*(ll)h-s;
    printf("%d\n",n-solve(m,s,w));
  }
  cout << maxh <<" " << maxw << " " << maxs <<" "<< maxhw<<endl;
  return false;
}