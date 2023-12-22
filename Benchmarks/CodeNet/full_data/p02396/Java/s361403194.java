import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int get,num = 1;
    while ((get=sc.nextInt()) != 0){
      System.out.println("Case "+num+": "+get);
      num++;
    }
  }
}

