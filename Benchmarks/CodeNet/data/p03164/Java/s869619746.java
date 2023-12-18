using namespace std;

int main() {
   int  n,w,gmax=0;
   cin>>n>>w;
   vector<int> weights(n,0),values(n,0);

   for(int i=0;i<n;i++)
    cin>>weights[i]>>values[i];

   vector<long long int> dp(100001);

   for(int i=0;i<=n;i++)
   {
       for(int j=0;j<100001;j++)
       {

           if(j==0)
           {
               dp[j]=0;
               continue;
           }

           if(i==0)
           {
               dp[j]=w+1;
               continue;
           }

           if(values[i-1]<=j)
           {
               dp[j]=min(weights[i-1]+dp[j-values[i-1]],dp[j]);
           }
       }
   }
    
    for(int j=0;j<100001;j++)
       {
           if(dp[j]<=w)
            gmax=max(gmax,j);
       }

   cout<<gmax;

   return 0;
}