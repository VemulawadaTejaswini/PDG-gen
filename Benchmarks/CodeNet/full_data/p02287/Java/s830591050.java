#include <stdio.h>
#include <stdlib.h>
#define MAX 100000
 
typedef struct node * Node;
#define NIL NULL

int main(){
	int i,j,n;
	int A[MAX+1];
	scanf("%d",&n);
	for(i=1; i<n+1; i++){
		scanf("%d",&A[i]);
	}
	for(i=1;i<n+1;i++){
		printf("node %d: key %d, ",i,A[i]);
		if(i>1)printf("parent key = %d,",A[i/2]);
		if(i*2<n+1)printf("left key = %d , ",A[i*2]);
		if(i*2+1<n+1)printf("right key = %d,",A[i*2+1]);
		printf("\n");
	}
}
