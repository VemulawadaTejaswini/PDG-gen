//#include<bits/stdc++.h>
#include<iostream>
#include<algorithm>
#include<cmath>
#include<vector>
#include<queue>
#include<set>

/*
#include<boost/multiprecision/cpp_int.hpp>
#include <boost/multiprecision/cpp_dec_float.hpp>
#include <boost/rational.hpp>
namespace mp = boost::multiprecision;
using Real = mp::number<mp::cpp_dec_float<1024>>;
using Bint = mp::cpp_int;
*/

using namespace std;

#define int long long
#define REP(i,s,e) for((i)=(s);(i)<(e);(i)++)
#define RREP(i,s,e) for((i)=((s)-1);(i)>=(e);(i)--)
#define FOR(i,n) for((i)=(0);(i)<(n);(i)++)
#define RFOR(i,n) for((i)=((n)-1);(i)>=(0);(i)--)
#define MOD 1000000007

signed main(){
    multiset<int> inp;

    int N,K;
    cin>>N>>K;

    for(int i=0;i<N;i++){
        int A;
        cin>>A;
        inp.insert(A);
    }

    int l=0;
    int r=LLONG_MAX;
    while(1){
        int m=(l+r)/2;
        multiset<int> log=inp;
        for(int i=0;i<K;i++){
            int L=*(log.rbegin());
            log.erase(log.find(L));
            if(L<=m) break;
            log.insert(m);
            log.insert(L-m);
        }
        int L=*(log.rbegin());
        if(L<=m){
            if(r==m) break;
            r=m;
        }
        else{
            if(l==m) break;
            l=m;
        }
    }
    cout<<r<<endl;
}

