#include<stdio.h>

int minint(int a,int b);

int main(void){
	int x=0,y=0,min,i=1;
	int alfa=0;

	scanf("%d %d",&x,&y);

	min=minint(x,y);

	while(i<=min){
		if(x%i==0&&y%i==0){
			alfa=i;
		}
		i++;
	}
	printf("%d \n",alfa);

}

int minint(int a,int b){
	int minint;

	if(a<b){
		minint=a;
	}
	if(b<a){
		minint=b;
	}
	return minint;
}

