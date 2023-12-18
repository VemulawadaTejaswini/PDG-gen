import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int checker = 0;
    for (int i=0;i<N;i++){
      int a = sc.nextInt();
      checker ^= a;
    }
    if (checker == 0){
    System.out.println("Yes");
    }else{
    System.out.println("No");
    }
  }
}