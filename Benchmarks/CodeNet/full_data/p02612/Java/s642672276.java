import java.io.*;
class Payment
{
  int n;
  main()
  {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    n=Integer.parseInt(br.readLine());
    if(n%1000==0)
      System.out.println(n%1000);
    else
      System.out.println(n%1000);
  }
}