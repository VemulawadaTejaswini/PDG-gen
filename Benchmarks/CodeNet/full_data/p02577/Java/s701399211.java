import java.util.Scanner;
public class s
{
  public static void main(String[] args)
  {
      int a=0;
      int s=0;
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int temp=n;
    while(temp>0)
    {
        a++;
        temp=temp/10;
    }
    temp=n;
    for(int i=0;i<a;i++)
    {
        s=s+(temp%10);
        temp=temp/10;
    }
    if(s%9==0)
    System.out.println("Yes");
    else
    System.out.println("No");
    
    
    
    
  }}