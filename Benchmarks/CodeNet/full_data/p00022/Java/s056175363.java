#include <stdio.h>
int array[1000];
int n,i,sum=0,k=0;
void tansaku(int a);
int main(void)
{
	while(1)
	{
		sum = 0;
		for(i=0;i<1000;i++)
		{
			array[i] = 0;
		}
		scanf("%d",&n);
		if(n==0)break;
		for(i=0;i<n;i++)
		{
			scanf("%d",&array[i]);
		}
		for(i=0;i<n;i++)
		{
			tansaku(i);
			k = 0;
		}
		printf("%d\n",sum);
	}
	return 0;
}
void tansaku(int a)
{
	if(a>n)return;
	k += array[a];
	if(k > sum)
	{
		sum = k;
	}
	if(a == n)return;
	tansaku(a+1);
}