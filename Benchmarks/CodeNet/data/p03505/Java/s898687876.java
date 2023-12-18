import java.util.Scanner;
class Main{
  public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
    long A =scan.nextLong();
    long B = scan.nextLong();
    long K = scan.nextLOng();
    if(A>=K){
      System.out.println(1);
      return;
    }
    if(A-B <= 0){
      System.out.println(-1);
      return;
    }
    long sub = A-B;
	long ans = 1 + ((K-A)/sub)*2;
    System.out.println(ans);
  }
}