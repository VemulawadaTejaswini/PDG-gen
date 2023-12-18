#include <bits/stdc++.h>
using namespace std;


int main() {
   int n;
   cin>>n;
   int arr1[n],arr2[n];

    for(int i=0;i<n;i++)cin>>arr1[i];

    for(int i=0;i<n;i++)cin>>arr2[i];

    int arr3[n];

    for(int i=1;i<=n;i++)arr3[i-1]=i;

    int first = 1,ans1 = 0,ans2=0;


    do{

        bool  flag1 =1,flag2=1;

        for(int i=0;i<n;i++){
            if(arr1[i]!=arr3[i]){
                flag1 = 0;
            }
            if(arr2[i]!=arr3[i]){
                flag2 = 0;
            }
        }


        if(flag1)ans1=first;
        if(flag2)ans2=first;


        first++;
    }while(next_permutation(arr3,arr3+n));

    cout<<abs(ans1-ans2)<<endl;



    return 0;
}
