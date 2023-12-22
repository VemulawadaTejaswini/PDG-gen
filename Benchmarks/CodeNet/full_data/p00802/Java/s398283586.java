#include<iostream>
#include<vector>
#include<cmath>
#include<algorithm>
#include<cassert>
#include<iomanip>
#define REP(i,s,n) for(int i=s;i<n;i++)
#define rep(i,n) REP(i,0,n)
#define inf (1<<28)
#define PI 3.14159265358979
#define MAX 45
#define EPS (1e-10)
#define equals(a,b) (fabs((a)-(b)) < EPS)
using namespace std;
typedef long double ld;
int n,m;
ld p[MAX];
ld area[MAX][MAX][MAX];//area[start point][last point][new point] := the area
ld dp[MAX][MAX][MAX];//dp[start point][last point][the number] := maximum area

double getArea(int i,int j)
{
  assert(i < n && j < n);
  return sin((p[j]-p[i])*2*PI)/2.0;//S = (b*c*sinA)/2,in this case, b = c = 1
}

void init_area()
{
  rep(i,n)//start point
    {
      REP(j,i,n)//last point
	{
	  REP(k,j,n)//new point
	    {
	      area[i][j][k] = getArea(i,j)+getArea(j,k)+getArea(k,i);
	    }
	}
    }
}

int main()
{
  while(cin >> n >> m,n|m)
    {
      rep(i,n)cin >> p[i];

      init_area();

      rep(i,MAX)rep(j,MAX)rep(k,MAX)dp[i][j][k] = -inf;
      rep(i,MAX)rep(j,MAX)dp[i][j][2] = 0;
      ld ans = -inf;
      rep(sp,n)
	{
	  //for(int cnt=m-1;cnt>=2;cnt--)
	  REP(cnt,2,m)
	    {
	      REP(lp,sp+1,n)
		{
		  REP(np,lp+1,n)
		    {
		      //if(cnt+1 == 4)cout <<" in? " << "dp["<<sp<<"]["<<lp<<"]["<<cnt<<"]" << endl;
		      if(dp[sp][lp][cnt] == -inf)continue;
		      //if(cnt+1 == 4)cout <<" in! " << dp[sp][lp][cnt] << endl;
		      dp[sp][np][cnt+1] = max(dp[sp][np][cnt+1],
					      dp[sp][lp][cnt]+area[sp][lp][np]);
	
		     
		      if(cnt+1 <= m)
			ans = max(ans,dp[sp][np][cnt+1]);  
		    }
		}
	    }
	}
      //rep(i,n)rep(j,n)cout << "dp["<<i<<"]["<<j<<"]["<<3<<"] = "<< dp[i][j][3] << endl;
      cout << setiosflags(ios::fixed) << setprecision(10) << ans << endl;
      //cout <<" ::: " <<  dp[0][3][4] << endl;
      //cout <<" ::: " <<  dp[1][3][3] << endl;
    }
  return 0;
}