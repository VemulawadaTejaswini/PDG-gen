import java.util.*;


public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int expMax = 1 ;

    for(int i = 2 ; i <= Math.sqrt(X); i ++){
      int index = 1 ;
      int exp = i;
      int expWork = exp;
      while(expWork <= X){
        if(expMax < expWork){
          expMax = expWork;
        }
        expWork = expWork * exp ;
        index ++ ;
      }
    }

    System.out.println(expMax);
  }
}
