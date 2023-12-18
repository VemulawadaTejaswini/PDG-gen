import java.util.*;

class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k=0;
    int a=sc.nextInt();
    int b=sc.nextInt();
    
    if(a%2 != b%2){
      System.out.println("IMPOSSIBLE");
    }else{
      k=(a+b)/2;
      System.out.println(k);
    }
  }
                   
    
  