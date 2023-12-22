#include <stdio.h>
#include <string.h>

int main(void)
{
	char str[100][100];
	int i, j, k, sum, mul;
	
	i = 0;
	sum = 0;
	while (scanf("%s" , str[i]) != EOF){
		for (j = 0; j < strlen(str[i]); j++){
			if (str[i][j] >= '0' && str[i][j] <= '9'){
				mul = 1;
				for (k = 1; str[i][j+k] - '0' >= 0 && str[i][j+k] - '0' <= 9; k++){
					mul *= 10;
					//printf("%d >%d\n", mul, j);
				}
				sum += (str[i][j] - '0') * mul;
			}
		}
		i++;
	}
	
	printf("%d\n", sum);
	
	return (0);
}