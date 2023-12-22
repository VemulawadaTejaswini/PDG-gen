#include<stdio.h>
#define INFTY 9999999
#define N 500000

void merge(int[],int,int,int);
void mergeSort(int[],int,int);

int count = 0;

int main()
{
  int i,n,A[N];

  scanf("%d",&n);
  
  for(i = 0; i < n; i++)
    scanf("%d",&A[i]);
  
  mergeSort(A,0,n);
  
  for(i = 0; i < n - 1; i++)
    printf("%d ",A[i]);
  
  printf("%d\n", A[n - 1]);
  printf("%d\n",count);
  
  return 0;
}
 void merge(int A[],int left,int mid,int right)
 {
   int n1 = mid - left;
   int n2 = right - mid;
   int L[N],R[N]; 
   
   int i;
	for( i = 0; i < n1; i++) 
	  L[i] = A[left + i];
	
	for ( i = 0; i < n2; i++)
	  R[i] = A[mid + i];
	
	L[n1] = INFTY;
	R[n2] = INFTY;
	
	i = 0;
	int j = 0;
	
	for(int k = left; k < right; k++)
	  if (L[i] <= R[j])
	    {
	      A[k] = L[i];
	      i++;
	      count++;
	    }
	
	  else 
	    {
	      A[k] = R[j];
	      j++;
	      count++;
	    }
	
	
    }

void mergeSort(int A[],int left,int right)
{
  int mid;
  
  if(left + 1 < right)
    {
      mid = (left + right)/2;
      mergeSort(A, left, mid);
      mergeSort(A, mid, right);
      merge(A, left, mid, right);
    }
}