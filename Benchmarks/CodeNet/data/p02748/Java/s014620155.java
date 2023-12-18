import java.util.Scanner;
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int m = sc.nextInt();
    int A[] = new int[a];
    int B[] = new int[b];
    int pay, min;
    min = 0;
    for(int i = 0; i < a; i++){
      A[i] = sc.nextInt();
    }
    for(int i = 0; i < b; i++){
      B[i] = sc.nextInt();
    }
    for(int i = 0; i < m; i++){
      pay = A[sc.nextInt()-1]+B[sc.nextInt()-1]-sc.nextInt();
      if(i==0||pay<min){
        min = pay;
      }
    }
    System.out.println(min);
  }
}