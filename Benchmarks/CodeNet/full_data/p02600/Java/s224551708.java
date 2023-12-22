import java.io.*;
class Main
{
  static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int x=Integer.parseInt(br.readLine());
    if(x>=400 && x<600)
      System.out.println("8");
    else if(x>=600 && x<800)
      System.out.println("7"); 
      else if(x>=800 && x<1000)
      System.out.println("6") ;
        else if(x>=1000 && x<1200)
      System.out.println("5");
      else if(x>=1200 && x<1400)
      System.out.println("4"); 
     else if(x>=1400 && x<1600)
      System.out.println("3"); 
      else if(x>=1600 && x<1800)
      System.out.println("2") ;
        else if(x>=1800 && x<2000)
      System.out.println("1");
  }
}