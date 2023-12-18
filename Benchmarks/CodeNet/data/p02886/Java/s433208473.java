import java.util.Scanner;
class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int sum =0;
    int number[] = new int[N];
    for (int i=0;i<N;i++) {
      int[i] = sc.nextInt();
      for (j=0;i<j;j<N;j++) {
        int con = number[i]*number[j];
         int sum += con;
      }
    }
    System.out.println(sum);
  }
}
    