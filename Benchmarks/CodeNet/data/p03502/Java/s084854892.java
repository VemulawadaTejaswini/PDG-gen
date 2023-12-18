import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int fX = 0;
    int quo = x;
    boolean flag = true;
    while(flag){
      fX += quo%10;
      quo = quo/10;
      if(quo == 0){
        flag = false;
      }
    }
    if(x/fX == 0){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}