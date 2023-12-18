import java.util.Scanner;

public class Main{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    System.out.println(calcB(A,B));

  }

  public static int calcA(int m, int n) {

    if(m < n) {
        int tmp = m;
        m = n;
        n = tmp;
    }
    int remainder = 0;
    while ((remainder = m % n) != 0) {
        m = n;
        n = remainder;
    }
    return n;
}

public static int calcB(int m, int n) {
    return m * n / calcA(m, n);

}
}