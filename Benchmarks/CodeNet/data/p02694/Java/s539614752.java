import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    int x = scan.nextInt();
    int count = 0;
    int mon = 100;
    
    do{
      mon = mon + (int)(mon/100);
      count++;
      if(mon >= x){
        System.out.println(count);
        break;
      }
    }while(true);
  }
}
