import java.util.*;

public class Main{
  public static void main(Sting[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int date = B - A;
    if(date <= 0){
      System.out.println("delicious");
    }else if(date <= X){
      System.out.println("safe");
    }else{
      System.out.println("danger");
    }
  }  
}