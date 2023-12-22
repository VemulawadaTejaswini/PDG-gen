#include <iostream>
#include <cstdio>
#include <string>
#include <string.h>
#include <algorithm>
#include <set>
#include <vector>
using namespace std;
const int SIZE = 1000000;

int a[20];
int chs[1<<16];
int n,sum;


int cal(int sta){
    int ret=0;
    for (int i=0;i<n;++i) 
        if (sta&(1<<i)) ret+=a[i];
    return ret;
}

int pp[10];
int flag[1<<16];

struct hash{
    vector<pair<int,int> > V[SIZE];
    int calhash(pair<int,int> a){
        unsigned int tmp= a.first;
        return (tmp*500009+a.second)%SIZE;
    }
    void init(){
        for (int i=0;i<SIZE;++i) V[i].clear();
    }
    void insert(pair<int,int> a){
        int t = calhash(a);
        for (int i=0;i<V[t].size();++i)
            if (V[t][i]==a) return;
        V[t].push_back(a);
    }
    bool find(pair<int,int> a){
        int t = calhash(a);
        for (int i=0;i<V[t].size();++i)
            if (V[t][i]==a) return true;
        return false;
    }
}S;
//set<pair<int,int> > S;

int main(){
    int _;
    scanf("%d",&_);
    while (_--){
        S.init();
        scanf("%d",&n);
        
        int lo=0;
        for (int i=0;i<n;++i){ 
            scanf("%d",&a[i]);
            lo+=a[i];
        }
        
        for (int sta=1;sta<(1<<n);++sta)
            chs[sta]=cal(sta);
        chs[0]=0;
        sum=0;
        int ans=0;
        int p1,p2,p3;
        for (int sta=1;sta<(1<<n);++sta){
            if (lo-chs[sta]<=chs[sta]) continue;
            
            int tsta=((1<<n)-1)^sta;
            int tchs=1<<(__builtin_ffs(tsta)-1);
            tsta^=tchs;
            
            int kk=0;
            for (int j=tsta;j>=0;j=(j-1)&tsta){
                if (!j) 
                    if (kk) break;
                    else kk=1;
                int chs2=j+tchs;
                sum++;
                pp[0]=chs[sta];
                pp[1]=chs[j+tchs];
                pp[2]=chs[((1<<n)-1)^sta^chs2];
                
                if (pp[1]>pp[0]) continue;
                if (pp[2]>pp[0]) continue;
                if (!pp[0] || !pp[1] || !pp[2]) continue;
                
                if (pp[1]>pp[2]) swap(pp[1],pp[2]);
                
                if (S.find(make_pair(pp[1],pp[2]))){
                    S.insert(make_pair(pp[1],pp[2]));
                    ++ans;
                }

            }
        }
        cout << ans << "\n";
//        cout << sum << endl;
    }
    return 0;
}
    