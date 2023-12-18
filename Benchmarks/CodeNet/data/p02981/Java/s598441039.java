import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int ansA = n*a;
    int ansB = b;
    
    if(ansA <= ansB){
      System.out.println(ansA);
    }
    else{
      System.out.println(ansB);
    }
  }
}
