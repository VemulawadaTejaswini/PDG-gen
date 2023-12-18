import java.io.*;

class Main
{
  public static void main(String[] args)throws IOException
  {
    BufferedReader br =
     new BufferedReader(new InputStringReader(System.in));

    String N = br.readLine();
    String S = br.readLine();

    int n = Integer.parseInt(N);
   
    for(int i=0; i<28; i++){
       String A = "ABCDEFGHIJKLMNOPQRSTUWXYZ";
  
       char ch = A.charAt(i);

       String B = "ch";
       char a = B.charAt(0);

       int b = A.indexOf(a);

       int c = (n+b)%26;
       char d = A.charAt(c);

       String C = S.replace("ch", "d");

       System.out.print("C");
    }
  }
}