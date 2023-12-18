import java.util.*;
class Main{
public static void main(String[] args) {
  Scanner reader =new Scanner (System.in);
  int a=reader.nextInt();
  int b=reader.nextInt();
  int c=reader.nextInt();
  int d=reader.nextInt();
  while(true)
  {
    c-=b;
    
    if(c<=0)
    {
      System.out.println("Yes");
      return;
    }
    a-=d;
    if(a<=0)
    {
      System.out.println("No");
      return;
    }

  }
}
}