import java.util.Scanner;
class raj{
  public static void main(String arr[])
  {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int n = sc.nextInt();
    int a[];
    a=new int[n];
    for(int i=0;i<a.length;i++)
    {
     a[i]=sc.nextInt();
          }
    int i=0;
    while(h>0)
    {
     if(i<a.length)
     {
       h=h-a[i];
      i++;
     }
      else{break;}
    }
    if(h<=0)
    {
     System.out.print("yes"); 
    }
    else{System.out.print("no");}
    
    
  }
}
