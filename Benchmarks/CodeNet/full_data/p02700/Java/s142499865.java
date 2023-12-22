import java.util.*;

class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt(); //next(文字列), nextDouble, nextLine(1行)とか
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    
    while(A > 0 && C > 0){
      C -= B;
      if (C <= 0){
        System.out.println("Yes");
        return;
      }
      A -= D;
      if (A <= 0){
        System.out.println("No");
        return;
      }
    }
    
  }
}
