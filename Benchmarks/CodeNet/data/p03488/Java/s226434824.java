#include<bits/stdc++.h>
using namespace         std;
#define                 int long long
#define                 pb push_back
#define                 mp make_pair
#define st(arr,a)       memset(arr,a,sizeof arr)
#define                 nl cout<<endl
#define                 real signed
#define                 endl '\n'              
#define countBit(x)     __builtin_popcountll(x)
const int mod = 1000000007ll;
#define all(x)          x.begin() , x.end()
#define pi pair<int,int>
#define X first
#define Y second
#define inf 1e18
#define Integer int
#define Double long double
#define String string
#define HashMap unordered_map
#define ArrayList vector
#define HashSet unordered_set
#define TreeSet ordered_set 
#define TreeMap ordered_map
#define Long int
#define containsKey count
#define Stack stack 
#define PriorityQueue priority_queue
#define Deque deque
#define addFirst push_front
#define addLast push_back
#define removeFirst pop_front
#define removeLast pop_back
#define Boolean bool
#define boolean bool
const int N=8000;
    String str;
    int dest=0;
    Boolean dp[N][2*N+1][3],vis[N][2*N+1][3];
    int n=0;
    boolean dfs(int i,int x,int f){
        if(i==n){
            if(dest==x-n)return true;
            return false;
        }
        if(vis[i][x][f])return dp[i][x][f];
        boolean ans=false;
        if(str[i]=='T'){
            if(f==1){
                ans=ans||dfs(i+1,x,0)||dfs(i+1,x,2);
            }
            else{
                ans=dfs(i+1,x,1);
            }
        }
        else{
            if(f==0){
                ans=dfs(i+1,x-1,f);
            }
            else if(f==1){
                ans=dfs(i+1,x,f);
            }
            else{
                ans=dfs(i+1,x+1,f);
            }
        }
        vis[i][x][f]=true;
        return dp[i][x][f]=ans;
    }

signed main(){
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);
        int t=0;
        cin>>str;
        n=str.length();
        int x,y;
        cin>>x>>y;
        st(vis,false);
        dest=x;
        boolean flag1=dfs(0,n,2);
        st(vis,false);
        dest=y;
        boolean flag2=dfs(0,n,1);
        if(flag1&&flag2)cout<<"Yes";
        else cout<<"No";
        return 0;
}

//       g++ -g main.cpp ; ./a.exe