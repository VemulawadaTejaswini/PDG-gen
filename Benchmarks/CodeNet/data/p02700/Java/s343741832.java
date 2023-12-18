import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t_hp = sc.nextInt();
    int t_atk = sc.nextInt();
    int a_hp = sc.nextInt();
    int a_atk = sc.nextInt();
    while(true){
      a_hp -= t_atk;
      if(a_hp<=0) { System.out.println(Yes); return;}
      t_hp -= a_atk;
      if(t_hp <= 0) { System.out.println(No); return;}
    }
  }