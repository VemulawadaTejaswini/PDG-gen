import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    while(C>0 && A>0){
      kougeki1(B,C);
      kougeki2(D,A);
    }

  private static void kougeki1(int Attack,int HP){
    HP -= Attack;
    if(HP<=0){
      System.out.println("Yes"); 
      break;
    }
  }
  private static void kougeki2(int attack,int hp){
    hp -= attack;
    if(hp <=0){
      System.out.println("No");
    }
  }
}