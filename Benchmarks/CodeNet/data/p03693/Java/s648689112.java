import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int r = sc.nextInt();
    int g = sc.nextInt();
    int b = sc.nextInt();
    
    int total = 100*r + 10*g + b;
    
    if(total%4==0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}