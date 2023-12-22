#include <stdio.h>

int binarySearch(int *,int key);
int n;
int q;
int T[10000];
int k=0;

int main(){
  int i,j;
  int c=0;
  int S[10000];
  int Q[10000];
  scanf("%d",&n);
  for(i=0; i<n; i++){
    scanf("%d",&S[i]);
  }
  scanf("%d",&q);
  for(i=0; i<q; i++){
    scanf("%d",&Q[i]);
  }
  for(i=0; i<n; i++){
    T[i] = -1;
  }
  
  for(i=0; i<q; i++){
    c += binarySearch(S,Q[i]);
  }
  printf("%d\n",c);
  return 0;
}

int binarySearch(int *A,int key){
  int i,j,m;
 
  int flug = 0;
  if(key == A[(0+n)/2]) {
    //    printf("%d is being checked.equal\n",key);
    if(flug == 0){
      T[k] = key;
      k++;
      flug = 1;
      //    printf("%d checked\n",key);
      return 1;
    }
  }
  else if(key < A[(0+n)/2]){
    m = (0+n)/2;
    A[m] = key;
    //  printf("%d is being checked.larger\n",key);
    for(i=0; i<m; i++){
      if(A[i]==key){
	for(j=0;j < n;j++){
	  if(key == T[j]){
	    //	    printf("same %d, ",T[j]);
	    return 0;
	  }
	}
	T[k] = key;
	k++;
	//	printf("%d checked\n",key);
	return 1;
      }
    }
  }
  else{
    //  printf("%d is being checked.smaller\n",key);
    m = (0+n)/2;
     A[n] = key;
    for(i=m+1; i<n; i++){
      if(A[i]==key){
	for(j=0;j < n;j++){
	  if(key == T[j]) {
	    //      printf("same %d, ",T[j]);
	    return 0;
	  }
	}
	T[k] = key;
	k++;
	//	printf("%d checked\n",key);
	return 1;
      }
    }

  }
  return 0;
}



