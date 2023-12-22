#include <stdio.h>
int main (void)
{
	int H,W;
	int t,y;

	while(1)
	{

		scanf("%d %d",&H,&W);

		if((H==0)&&(W==0))break;

		for(t=0;t<H;t++)
		{

			for(y=0;y<W;y++)
			{
				if((t==0)||(t==H-1)||(y==0)||(y==W-1))
				{
					printf("#");
				}
				else
				{	
					printf(".");
				}
			}

			printf("\n");
		}
	}

	return 0;
}