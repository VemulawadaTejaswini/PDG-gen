#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    scanf("%d",&n);
    long long array[n + 1];
    long long diff[n];
    long long sum = 0;
    for(int i = 1;i <= n;i++){
        scanf("%lld",&array[i]);
        sum += array[i];
        }
    array[0] = array[n];
    if(sum % ((long)n * (n + 1)/2)){
    printf("NO");
    return 0;
    }
    int times = sum * 2 / ((long)n * (n + 1));
    long long cnt = 0;
    for(int i = 0;i < n;i++){
            diff[i] = array[i + 1] - array[i] - times;
            if(diff[i] > 0){
            printf("NO");
            return 0;
            }
            if(diff[i] < 0){
            if(abs(diff[i]) % n){
            printf("NO");
            return 0;
            }
            cnt += abs(diff[i])/n;
            }
        }
     if(cnt > times){
     printf("NO");
     return 0;
     }
     printf("YES");
     return 0;
    }
