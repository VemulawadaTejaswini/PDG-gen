import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = 0;
    
    for(int i=a ; i<=b ; i++){
      int a1 = i/1000;
      int b1 = (i%1000)%100;
      if(a1==b1){
        sum++;
      }
    }
    System.out.println(sum);
  }
}