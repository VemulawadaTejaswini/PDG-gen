import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int a = sc.nextInt();
    String s = sc.next();
    
    if(judge(a);){
      System.out.println(s);
    }else{
      System.out.println("red");
    }
  }
  
  public boolean judge(int number){
    return number >= 3200;
  }
}