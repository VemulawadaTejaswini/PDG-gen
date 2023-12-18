import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int p = sc.nextInt();
    
    for(int x=0 ; x<=n ; x++){
      for(int y=0 ; y<=(n-x); y++){
         int z=n-x-y;
          
          int total = 10000*x + 5000*y + 1000*z;
          if(p==total){
            System.out.print(x+" "+y+" "+z);
            return;
          }
      }
    }
    System.out.println("-1 -1 -1");
  }
}       