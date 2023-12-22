import java.util.Scanner;

public class main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    int x = scan.nextInt();
    int count = 0;
    int mon = 100;
    
    do{
      mon = mon + mon * 0.01;
      count++;
      if(mon >= x){
        System.out.println(count);
        break;
      }
    }while(true);
  }
}