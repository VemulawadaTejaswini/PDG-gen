import java.util.*;
 
class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    int x = sc.nextInt(); //next(文字列), nextDouble, nextLine(1行)とか
    if (x == 1){
            System.out.println(0+" "+-1);
            return;
    }
    
    for (int i = 2; i<=x;i++){
      if (x%i == 0){
        for (int j = 1; j<x;j++){
          int A = j;
          int B = A - i;
          if (Math.pow(A,4)+Math.pow(A,3)*B+Math.pow(A,2)*Math.pow(B,2)+A*Math.pow(B,3)+Math.pow(B,4) == x/i){
            System.out.println(A+" "+B);
            return;
          }
        }
      }
    } 
  }
}