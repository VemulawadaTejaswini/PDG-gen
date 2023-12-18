import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    double b = a/1.08;
    double c = (a+1)/1.08;
    int d = (int)c;

    if(b<=d){    

    if(d*1.08 == a){
      System.out.println(d);        
    }

    else{
      System.out.println(":(");
    }
    }

    else{
     System.out.println(":(");
    }
  }
}