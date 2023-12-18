
import java.util.*;
class solution  
{ 
   
      
    /* Driver program to test above function */
    public static void main(String[] args) 
    { 
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
      	int M =sc.nextInt();
        N=N*(N-1)/2;
      	M=M*(M-1)/2;
      	System.out.println(N+M);      
    } 
} 