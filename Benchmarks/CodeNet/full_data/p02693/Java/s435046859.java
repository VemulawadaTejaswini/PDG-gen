import java.util.*;

class main{
  
  public static void main(String args[])
  {

    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    int n=sc.nextInt();
    int m=sc.nextInt();
    
    for(int i=n;i<=m,;i++)
    {
      if(i%k==0){
        System.out.println("OK");
        break;
      }
    }
  }
}
        
    
    
    
  
  
  