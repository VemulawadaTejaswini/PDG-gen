import java.util.*;
class b
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int count=0,j=0,k=0,g=0,m=0;
    for(int i=0;i<n;i++)
    {
        String s=sc.nextLine();
      if(s=="AC")j++;
   else if(s=="WA")k++;
     else if(s=="TLE")g++;
      else m++;
    }
    System.out.println("AC x "+j);
     System.out.println("WA x "+k);
     System.out.println("TLE x "+g);
     System.out.println("RE x "+m);
}
} 
    
    
