import java.util.Scanner;
public class Main{ 
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    while(true){
      int m = sc.nextInt(); 
      int f = sc.nextInt();
      int r = sc.nextInt();
      if (m == -1 && f == -1 && r == -1){ 
        break; 
      } 
      if(m==-1 || f==-1){
        System.out.println("F");
      } 
      else{
        int S = m + f;
        if(S>=80){
          System.out.println("A");
        }
        else if(S<80 && S>=65){
          System.out.println("B");
        }
        else if(S<65 && S>=50){
          System.out.println("C");
        }
        else if(S<50 && S>=30){
          if(r>=50){
            System.out.println("C");
          }
          else if(r<50){
            System.out.println("D");
          }
        }
        else if(S<30){
          System.out.println("F");
        }
      }
    }
  }
}