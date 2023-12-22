import java.util.*;
class Main{
  Scanner sc = new Scanner(System.in);
  public static void main(String[] args){
    int N = sc.nextInt();
    switch(N%10){
      case 3:System.out.println("bon");break;
      case 0:case 1:case 6:case 8:System.out.println("pon");break;
      default:System.out.println("hon");break;
    }
  }
}