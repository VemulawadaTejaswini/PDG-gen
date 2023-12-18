import java.util.Scanner;

class Main{
  public static main(String[] args){
    Scanner sc = new Scanner(System.in);
    final int K = sc.nextInt();
    final int A = sc.nextInt();
    final int B = sc.nextInt();
    sc.close();
    String is_ok = "NG";
    for(int i=A;i<=B;i++){
      if(i%K == 0){
        is_ok = "OK";
      }
    }
    System.out.println(is_ok);
  }
}