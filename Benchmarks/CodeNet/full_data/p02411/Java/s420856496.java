import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int m,f,r,sum;
    while(true){
      m = sc.nextInt();
      f = sc.nextInt();
      r = sc.nextInt();
      sum = m + f;

      if(m == -1 && f == -1 && r == -1){
        break;
      }
      if(m == -1 || f == -1){
        System.out.println("F");
      }
      else if(sum >= 80){
        System.out.println("A");
      }
      else if(sum >= 65){
        System.out.println("B");
      }
      else if(sum >= 50){
        System.out.println("C");
      }
      else if(sum >= 30){
        if(r >= 50){
          System.out.println("C");
        }
        else{
          System.out.println("D");
        }
      }
      else{
        System.out.println("F");
      }
    }
  }
}