import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    int tHp = scan.nextInt();
    int tAt = scan.nextInt();
    int aHp = scan.nextInt();
    int aAt = scan.nextInt();
    int count = 2;
    
    do{
      if(count%2 == 0){
        aHp = aHp - tAt;
      }else{
        tHp = tHp - aAt;
      }
      count = count + 1;
    }while(aHp <= 0 || tHp <= 0);
    
    if(aHp <=0)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
      