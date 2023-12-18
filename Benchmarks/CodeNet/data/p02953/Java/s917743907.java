import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Nums[]=new int[N];
    boolean result=false;
    for (int i = 0; i < N; i++) {
     Nums[i] = sc.nextInt();
    }
    
    for (int i = 0; i < N; i++) {
       if(i>0){
         if(Nums[i-1]<=Nums[i]){
         	continue;
         }else if(Nums[i-1]>Nums[i]){
          	Nums[i-1]-=1;
          
        }
       }
    }
    for (int i = 0; i < N; i++) {
     if(i>0){
      if(Nums[i]<Nums[i-1]){
     	result=true;
        break;
      }
     } 
    }
    
    if(result==true){
    	System.out.println("No");
    }else{
    	System.out.println("Yes");
    }
  }
}