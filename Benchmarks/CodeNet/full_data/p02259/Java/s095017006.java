#include<stdio.h>
#include<stdlib.h>
int main(void) {
	int temp, i, cnt = 0, flag, j;
  	int numbers[100];
 
  scanf("%d", &j);
   
  for(i = 0;i < j;i++){
    scanf("%d", &numbers[i]);
  }

  flag = 1;
  while(flag) {
  	flag = 0;

  	for( i = j-1; i>=1; i--) {
  		if(numbers[j] < numbers[j-1] ) {
  			temp = numbers[j-1];
  			numbers[j-1] = numbers[j];
  			numbers[j] - temp;
  			flag = 1;
  			cnt++;
  		}
  	}
  }
  for(i = 0;i < j-1;i++){
    printf("%d ", numbers[i]);
  }
  printf("%d\n", numbers[i]);
  printf("%d\n", cnt);
  return 0;
}

	
