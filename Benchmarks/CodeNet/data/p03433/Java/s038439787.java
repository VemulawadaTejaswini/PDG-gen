import java.util.*;

class Main{
  static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int mai = N/500;
    N = N-mai*500;
    if(N==A){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}