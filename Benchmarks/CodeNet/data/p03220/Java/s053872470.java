import java.util.*;
class Main {
  public static void main (String[] args)  {
    
    Scanner sc = new Scanner(System.in);
    
    int n=sc.nextInt();
    int t=sc.nextInt();
    int a=sc.nextInt();
    
    int h=0;
    int x[] = new int[n];
    
    int tmp=1000;
    
    int ans=0;
    
    
    for(int i=0; i<n;i++){
      h=sc.nextInt();
      x[i]=t-h*6/1000;
      if( Math.abs(x[i]-a)<tmp){
        tmp=x[i];
        ans=i;
        }
     }
     
     
      System.out.println(ans);
     


  }
}