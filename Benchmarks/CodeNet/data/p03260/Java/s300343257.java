import java.util.* ; 
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
	int n = scan.nextInt();
 	int x = scan.nextInt();
	
    for(int i = n ; i<=x ;i++){
      if(i*n*x % 2 != 0){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
    
  }
}