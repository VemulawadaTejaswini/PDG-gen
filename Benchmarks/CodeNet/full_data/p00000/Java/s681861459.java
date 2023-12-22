public class Main{
  public static void main(String[]args)
  {
    int m;
    int n;
    
    for(m=1;m<=9;m++)
    {
      for(n=1;n<=9;n++)
      {
        int multi= m*n;
        System.out.println(m+"X"+n+"="+multi);
      }
    }
  }
}