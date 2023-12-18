import java.util.* ; 
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);

	
	int x  = scan.nextInt();
    int y = scan.nextInt();
    int arr[] = new int[x];
    int arr2[] = new int[x];
    int arr3[] = new int[y];
    int arr4[] = new int[y];
    for(int i = 0 ; i< x ; i++){
        arr[i] = scan.nextInt();
        arr2[i] = scan.nextInt();
      
    }
     for(int i = 0 ; i< y ; i++){
     
        arr3[i] = scan.nextInt();
        arr4[i] = scan.nextInt();
      
    }
  
    for(int i = 1 ; i <= x ; i++){
        int max = 999 ;
    	int c = 1 ;
      for(int j = 1 ; j <= y ; j++){
        
        if ((Math.abs(arr[i-1]-arr3[j-1]) + Math.abs(arr2[i-1]-arr4[j-1])) < max){
           max = arr[i-1]-arr3[j-1] + arr2[i-1]-arr4[j-1] ;
           c = j ;
         }
      }
      System.out.println(c);

    }
    
    
  }
}
