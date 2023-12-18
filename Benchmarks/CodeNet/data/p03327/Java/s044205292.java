import java.util.Scanner;

class Rp1ABC099A{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if(a < 999){
      System.out.println("ABC");
    }else{
      System.out.println("ABD");
    }
  }
}