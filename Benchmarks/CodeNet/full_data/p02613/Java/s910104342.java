import java.util.*;
class b
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
String c=sc.next();
String s1="AC";
String s2="WA";
String s3="TLE";
String s4="RE";
  int count=0,j=0,k=0,g=0,m=0;
if(n>=1 && n<=100000){
    for(int i=1;i<=n;i++)
    {
       String s=sc.nextLine();
      if(s1.equals(s))j++;
   else if(s2.equals(s))k++;
     else if(s3.equals(s))g++;
      else if(s4.equals(s))m++;
    }
    System.out.println("AC x "+j);
     System.out.println("WA x "+k);
     System.out.println("TLE x "+g);
     System.out.println("RE x "+m);
}
}
}