import java.io.*;
public class FennecMonster
  {
  public static void main(String [] args)
    {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the no. of Monsters");
    int n= sc.nextInt();
    int h= new int [n];
    System.out.println("Enter the no. of special moves");
    int k= sc.nextInt();
     System.out.println("Enter health of all the monsters.");
    int p = 0;
    for(int i=0; i<n; i++)
      {
      h[i]= sc.nextInt();
      p= p+ h[i];
     }
    if( k== 0)
     
      System.out.println( p);
     else if(k>= n) 
       System.out.println(0);
       else
         {
         for( i=0; i<n; i++)
           {
           for( int j=0; j<n-i; j++)
             {
             if(h[j]> h[j+1])
               {
               int temp= h[j]
                 h[j]= h[j+1];
               h[j+1]=temp;
               }
             }
           }
         for(i=0; i<k; i++)
           {
           p= p- h[n-i-1];
           }
         System.out.print(p);
         }
    }
  }
         
         
     
   
    