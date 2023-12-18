import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    int num = A + B;
    int mai = A - B;
    int seki = A * B;
    
    int bigger = 0;
    if(num > mai) {
      bigger = num;
    }else{
      bigger = mai;
    }
    
    if(bigger > seki) {
      System.out.println(bigger);
    }else{
      System.out.println(seki);
    }
  }
}