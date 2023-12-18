import java.util.*;

public class Main{
	public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
      
    int N = scn.nextInt();
    int L[] = new int[N];
    int max=0;
    int sum=0;
    
     for(int i=0;i<N;i++){
     L[i]=scn.nextInt();
     }
      
	for(int i=0;i<N-1;i++){
      if(max<L[i+1]){
      max=i;
      sum+=L[i+1];
      }
    }
    if(L[max]<sum){
      System.out.print("Yes");
       }else{
      System.out.print("No");
    }
    
      
    
     
    }
}
    