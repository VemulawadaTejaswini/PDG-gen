
     
      import java.util.*;
class Main {
  public static void main (String[] args)  {
    
    Scanner sc = new Scanner(System.in);
    
    int n=sc.nextInt();
    int t=sc.nextInt();
    int a=sc.nextInt();
    
    int h=0;
    int x=0;
    
    int tmp=100000;
    
    int ans=1;
    
    
    for(int i=0; i<n;i++){
      h=sc.nextInt();
      x=t-h*6/1000;
      if( Math.abs(x-a)<tmp){
        tmp=Math.abs(x-a);
        ans=i+1;
        }
     }
     
     
      System.out.println(ans);
     


  }
}