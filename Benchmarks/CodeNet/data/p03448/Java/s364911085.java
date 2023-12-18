import java.util.*;

class Main{
 	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);  
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int X = sc.nextInt();
	int count = 0;
    for(int ca = 0 ; ca < A+1 ; ++ca){
    	for(int cb = 0 ; cb < B+1 ; ++cb){ 
  		   for(int cc = 0 ; cc < C+1 ; ++cc){
             if( (ca*500 + cb*100 + cc *50) == X){
               ++count;
             }
           }
        }
    }
      
      
    System.out.println(count);
    }	
      
  
  
}