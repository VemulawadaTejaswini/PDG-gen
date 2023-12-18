#include<iostream>
using namespace std;

int main(){
  int a[5];
  cin>>a[0]>>a[1]>>a[2]>>as[3]>>a[4];
  int min = 10;
  int n = 0;
  for(int i = 0;i < 5;i ++){
    if((a[i] - 1) % 10 < min){
      min = a[i] % 10;
      n = i;
    }
  }
  int sum = 0;
  for(int i = 0;i < 5;i ++){
    if(i != n) sum += (a[i] / 10 + 1) * 10;
  }
  sum += a[n];
  cout << sum << endl;
}
