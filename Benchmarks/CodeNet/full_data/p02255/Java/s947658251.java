import java.util.Scanner;
class InsertS{

public static void f(int A[],int N){
int i;

for(i=0;i<N;i++){
	if(i>0)
		System.out.print(" ");
  System.out.print(A[i]);
}
 System.out.printf("\n");
}
 
 
   
public static void insertionSort(int A[],int N){
    int i,j,v;
    for(i=1;i<N;i++){
        v=A[i];
        j=i-1;
   while(j>=0 && A[j]>v){
       A[j+1]=A[j];
       j--;
}
   A[j+1]=v;
   
  f(A,N);
}
}
   


public static void main(String[] args){
         
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
	         int N=input.nextInt();
             int A[]=new int[100];
             
             int i;
             for(i=0;i<N;i++){
            	 A[i] = input.nextInt();
             }
	        
	   f(A,N);
       
        insertionSort(A,N);
}
}