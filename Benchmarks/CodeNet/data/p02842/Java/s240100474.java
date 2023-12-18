import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();

    double a = i/1.08;
    int b = (int)a;

    if((b+1)*1.08 == i){
      System.out.println(b);
    }
    else if((b+1)*1.08 != i){
      System.out.println(":(");
    }
  }
}