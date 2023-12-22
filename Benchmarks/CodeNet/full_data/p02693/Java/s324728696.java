import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    boolean flag = false;
    for (int i = a; i <= b; i++){
      if (i%K==0){
        flag = true;
      }
    }
    if (flag){
      System.out.println("OK");
    }else{
      System.out.println("NG");
    }
  }
}