#include<stdio.h>
#include<stdlib.h>

int main(){
  int i = 0;
  int data = 0;
  int V = 0;
  int j = 0;
  int *insert;

  scanf("%d",&data);
  insert = (int *)malloc(sizeof(int));
for(i = 0 ; i++ ; i < data){
scanf("%d",insert[i]);
}

for(i = 1; i++ ; i <= data-1){
  V = insert[i];
  j = i - 1;

  while(j >= 0 && insert[j] > V){
    insert[j + 1] = insert[j];
    j--;
    insert[j + 1] = V;
  }
}
for(i = 1 ; i++ ; i < data){
  printf(" %d ",&insert[i]);
}
printf("\n");
}

