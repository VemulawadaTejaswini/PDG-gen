import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    
    int count = 1;
    
    if(n < k){
      System.out.println(count);
    }
    
    for(int i=1; i<n; i++){
      if( (k*k)-1 < n ){
        count++;
        k *= k;
      }
      
      if( (k*k)-1 >= n ){
        count++;
        break;
      }
    }
    
    System.out.println(count);
    
  }
}
