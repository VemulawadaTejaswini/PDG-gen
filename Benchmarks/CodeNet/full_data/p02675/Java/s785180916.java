import java.util.Scanner;

public class Main{
  
  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    int how = scan.nextInt();
    int count = 0;
    count = how%10;
    
    if(count = 3){
      System.out.println("bon");
    }else if(count = 0){
      System.out.println("pon");
    }else if(count = 1){
      System.out.println("pon");
    }else if(count = 6){
      System.out.println("pon");
    }else if(count = 8){
      System.out.println("pon");
    }else{
      System.out.println("hon");
    }