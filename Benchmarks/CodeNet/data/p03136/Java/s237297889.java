import java.util.*;

public class Main{
	public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
      
    int N = scn.nextInt();
    int L[] = new int[N];
    int max=0;
    int sum=0;
    int maxint=0;
    
     for(int i=0;i<N;i++){
     L[i]=scn.nextInt();
     }
      
	for(int i=0;i<N;i++){
      if(max<L[i]){
      max=L[i];
      maxint=i;
      sum+=L[i];
       // System.out.println("maxint="+maxint+",max="+max);
      }
    }
    if(L[maxint]<(sum-L[maxint])){
      System.out.print("Yes");
       }else{
      System.out.print("No");
    }

    }
}
    