#include <stdio.h>
#include <algorithm>
using namespace std;
int a[100000];
int main(){
	int N,temp,c=0;
	fill(a,a+100000,0);
	scanf("%d%*c",&N);
	while(N--){
		scanf("%d%*c",&temp);
		a[temp]+=1;
	}
	for(int i=0;i<100000;i++){
		if(a[i]%2==1){
			c++;
		}
	}
	printf("%d",c);
	return 0;
}
