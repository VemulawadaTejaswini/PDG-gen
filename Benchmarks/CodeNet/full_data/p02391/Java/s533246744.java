import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
  
class Main{
  public static void main(String args[]) throws IOException{
     int a,b;
      Scanner nhap= new Scanner(System.in);
      a=nhap.nextInt();
      Scanner nhap= new Scanner(System.in);
      b=nhap.nextInt();
     if(a>b)
            System.out.println("a>b");
     if(a<b)
            System.out.println("a<b");
     else
            System.out.println("a=b");
  }
}