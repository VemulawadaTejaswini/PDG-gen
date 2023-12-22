import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    while(true){
      int m = sc.nextInt();
      int f = sc.nextInt();
      int r = sc.nextInt();
      int goukei = m + f;
      if(m == -1 && f == -1 && r == -1){
        break;
      }
      if((m == -1 || f == -1) || goukei < 30){
        System.out.println("F");
      }else if(goukei >= 80){
        System.out.println("A");
      }else if(goukei >= 65 && goukei < 80){
        System.out.println("B");
      }else if(goukei >= 50 && goukei < 65){
        System.out.println("C");
      }else{
        if(r >=50){
          System.out.println("C");
        }else{
          System.out.println("D");
        }
      }
    }
  }
}
