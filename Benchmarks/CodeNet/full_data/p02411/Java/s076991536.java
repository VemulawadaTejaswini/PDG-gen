import java.util.Scanner;

public class Main{
  public static void main(String[] args){
      Scanner sc     = new Scanner(System.in);
  for(int i = 0;i<50;i++){
      int m          = sc.nextInt();
      int f          = sc.nextInt();
      int r          = sc.nextInt();

      if(m==-1 && f==-1 && r==-1)
          break;

      if(m==-1||f==-1){
                System.out.println("F");
          }else if(80 <= m + f){
                System.out.println("A");
          }else if(65 <= m + f){
                System.out.println("B");
          }else if(50 <= m + f){
                System.out.println("C");
          }else if(30 <= m + f){
                if(50 <= r){
                  System.out.println("C");
                }else{
                  System.out.println("D");
                }
          }else{
                System.out.println("F");
          }
  }
  }
}

