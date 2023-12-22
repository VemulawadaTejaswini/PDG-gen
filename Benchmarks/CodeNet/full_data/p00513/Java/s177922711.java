#include<stdio.h>
int main(){
	int a;
	scanf("%d",&a);
	int ret=0;
	for(int i=0;i<a;i++){
		int b;
		scanf("%d",&b);
		b=b*2+1;
		bool ok=false;
		for(int j=1;(2*j+1)*(2*j+1)<=b;j++){
			if(b%(2*j+1)==0)ok=true;
		}
		if(!ok)ret++;
	}printf("%d\n",ret);
}