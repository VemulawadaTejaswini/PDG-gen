import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int mintotal=-1;
    for(int A=0; A<=N/2;A++){
      
      int sumA=findSumOfDigits(A);
      int sumB=findSumOfDigits(N-A);
      
      if((mintotal > (sumA+sumB)) || (mintotal==-1)){
        mintotal = sumA+sumB;
      }
    }
    
    System.out.println(mintotal);
  }
}
    
      
      
    
  