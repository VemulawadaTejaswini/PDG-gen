import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner();
    int s1 = sc.nextInt();
    int s2 = sc.nextInt();
    int s3 = sc.nextInt();
    switch(s1 + s2 + s3){
      case 0:
        System.out.println(0);
        break;
      case 1:
        System.out.println(1);
        break;
      case 2:
        System.out.println(2);
        break;
      case 3:
        System.out.println(3);
        break;
    }
  }
}